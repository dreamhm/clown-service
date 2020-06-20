package com.hm.serve.userInfo.service.impl;

import com.hm.common.entity.ClownConstant;
import com.hm.common.utils.*;
import com.hm.serve.userInfo.dao.IUserInfoDao;
import com.hm.serve.userInfo.model.UserInfo;
import com.hm.serve.userInfo.service.IUserInfoService;
import com.hm.common.entity.ClownResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

    @Autowired
    private IUserInfoDao userInfoDao;

/*    @Autowired
    private AuthenticationManager authenticationManager;*/

    public ClownResult addUserInfo(UserInfo userInfo) {
        int retrunCode = 0;
        if(userInfo.getId() == null || userInfo.getId().equals("")){
            userInfo.setId(SnowFlake.genId());
            String salt = Md5Utils.salt();
            String md5Pas = Md5Utils.md5(userInfo.getPassword()+salt);
            userInfo.setSalt(salt);
            userInfo.setPassword(md5Pas);
            retrunCode = userInfoDao.insertUserInfo(userInfo);
        }else {
            retrunCode = userInfoDao.updateUserInfo(userInfo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult queryUserInfoById(Long id) {
        UserInfo userInfo = userInfoDao.selectUserInfoById(id);
        return ClownResultUtil.getClowenResultByData(userInfo);
    }

    @Override
    public UserInfo queryUserInfoByName(String username) {
        UserInfo userInfo = userInfoDao.selectUserInfoByName(username);
        return userInfo;
    }

    @Override
    public ClownResult queryUserList(Map<String, Object> param) {
        Map<String, Object> data = new HashMap<>();
        List<UserInfo> userlist = userInfoDao.selectUserList(param);
        int count = userlist.size();
        data.put("data",userlist.subList(
                PagingUtil.startIndex(param),
                PagingUtil.endIndex(param, count)));
        data.put("count",count);
        return ClownResultUtil.getClowenResultByData(data);
    }

    public ClownResult delUserInfoById(Long id) {
        int retrunCode = userInfoDao.delUserInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    //登陆与授权.
    @Override
    public ClownResult loadUserByUsername(String username, String password) {
        Map<String, String> data = new HashMap<String, String>();
        final UserInfo userInfo = userInfoDao.selectUserInfoByName(username);
        if (userInfo == null){
            return ClownResultUtil.getClowenResultByData("user not exist");
        }
        if(!userInfo.getPassword().equals(Md5Utils.md5(password + userInfo.getSalt()))){
            return ClownResultUtil.getClowenResultByData("error username or password");
        }

        String authorization = TokenUtil.createJWT(userInfo.getUsername(), userInfo.getPassword(), "privileges");
        authorization = ClownConstant.tokenHead + authorization;

        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        simpleGrantedAuthorities.add(new SimpleGrantedAuthority("USER"));
        Authentication authentication = new UsernamePasswordAuthenticationToken(username, password, simpleGrantedAuthorities);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // 持久化的redis
        CacheUtils.saveBean(authorization, userInfo);

        data.put("Authorization", authorization);
        return ClownResultUtil.getClowenResultByData(data);
    }

    @Override
    public ClownResult getToken(String token) {
        UserInfo userInfo = CacheUtils.getBean(token , UserInfo.class);
        System.out.println(userInfo.getUsername());
        return ClownResultUtil.getClowenResultByData(userInfo);
    }

}
