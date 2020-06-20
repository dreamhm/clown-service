package com.hm.manage.user.service.impl;

import com.hm.common.entity.ClownResult;
import com.hm.common.utils.ClownResultUtil;
import com.hm.common.utils.PagingUtil;
import com.hm.common.utils.SnowFlake;
import com.hm.manage.user.dao.IUserDao;
import com.hm.manage.user.model.UserGroupBo;
import com.hm.manage.user.model.UserGroupRoleBo;
import com.hm.manage.user.model.UserGroupUserInfoBo;
import com.hm.manage.user.model.UserRoleBo;
import com.hm.manage.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public ClownResult addUserGroupInfo(UserGroupBo userGroupBo) {
        int retrunCode = 0;
        if(userGroupBo.getId() == null || userGroupBo.getId().equals("")){
            userGroupBo.setId(SnowFlake.genId());
            retrunCode = userDao.insertUserGroupInfo(userGroupBo);
        }else {
            retrunCode = userDao.updateUserGroupInfo(userGroupBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getUserGroupInfoById(Long id) {
        UserGroupBo userGroupBo = userDao.selectUserGroupInfoById(id);
        return ClownResultUtil.getClowenResultByData(userGroupBo);
    }

    public ClownResult queryUserGroupList(Map<String, Object> param){
        Map<String, Object> data = new HashMap<>();
        List<UserGroupBo> userGroupList = userDao.selectUserGroupList(param);
        int count = userGroupList.size();
        data.put("data",userGroupList.subList(
                PagingUtil.startIndex(param),
                PagingUtil.endIndex(param, count)));
        data.put("data", userGroupList);
        data.put("count", count);
        return ClownResultUtil.getClowenResultByData(data);
    }

    public ClownResult deleteUserGroupInfoById(Long id) {
        int retrunCode = userDao.delUserGroupInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addUserGroupRoleInfo(UserGroupRoleBo userGroupRoleBo) {
        int retrunCode = 0;
        if(userGroupRoleBo.getId() == null || userGroupRoleBo.getId().equals("")){
            userGroupRoleBo.setId(SnowFlake.genId());
            retrunCode = userDao.insertUserGroupRoleInfo(userGroupRoleBo);
        }else {
            retrunCode = userDao.updateUserGroupRoleInfo(userGroupRoleBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getUserGroupRoleInfoById(Long id) {
        UserGroupRoleBo userGroupRoleBo = userDao.selectUserGroupRoleInfoById(id);
        return ClownResultUtil.getClowenResultByData(userGroupRoleBo);
    }

    public ClownResult deleteUserGroupRoleInfoById(Long id) {
        int retrunCode = userDao.delUserGroupRoleInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addUserGroupUserInfo(UserGroupUserInfoBo userGroupUserInfoBo) {
        int retrunCode = 0;
        if(userGroupUserInfoBo.getId() == null || userGroupUserInfoBo.getId().equals("")){
            userGroupUserInfoBo.setId(SnowFlake.genId());
            retrunCode = userDao.insertUserGroupUserInfo(userGroupUserInfoBo);
        }else {
            retrunCode = userDao.updateUserGroupUserInfo(userGroupUserInfoBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getUserGroupUserInfoById(Long id) {
        UserGroupUserInfoBo userGroupUserInfoBo = userDao.selectUserGroupUserInfoById(id);
        return ClownResultUtil.getClowenResultByData(userGroupUserInfoBo);
    }

    public ClownResult deleteUserGroupUserInfoById(Long id) {
        int retrunCode = userDao.delUserGroupUserInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addUserRoleInfo(UserRoleBo userRoleBo) {
        int retrunCode = 0;
        if(userRoleBo.getId() == null || userRoleBo.getId().equals("")){
            userRoleBo.setId(SnowFlake.genId());
            retrunCode = userDao.insertUserRoleInfo(userRoleBo);
        }else {
            retrunCode = userDao.updateUserRoleInfo(userRoleBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getUserRoleInfoById(Long id) {
        UserRoleBo userRoleBo = userDao.selectUserRoleInfoById(id);
        return ClownResultUtil.getClowenResultByData(userRoleBo);
    }

    public ClownResult deleteUserRoleInfoById(Long id) {
        int retrunCode = userDao.delUserRoleInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }
}
