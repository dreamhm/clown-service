package com.hm.common.security.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hm.common.utils.Md5Utils;
import com.hm.serve.userInfo.model.UserInfo;
import com.hm.serve.userInfo.service.IUserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:自定义JSON登录
 */
@Slf4j
public class CustomJSONLoginFilter extends AbstractAuthenticationProcessingFilter {

    private IUserInfoService userInfoService;

    CustomJSONLoginFilter(String defaultFilterProcessesUrl, IUserInfoService userInfoService){
        super(new AntPathRequestMatcher(defaultFilterProcessesUrl, HttpMethod.POST.name()));
        this.userInfoService = userInfoService;
    }
    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest,
                                                HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {
        JSONObject requestBody = getRequestBody(httpServletRequest);

        String username = requestBody.getString("username");
        String password = requestBody.getString("password");
        ValidateUsernameAndPassword(username, password);
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
        simpleGrantedAuthorities.add(new SimpleGrantedAuthority("USER"));
        return new UsernamePasswordAuthenticationToken(username, password, simpleGrantedAuthorities);
    }

    /**
     * 获取请求体
     */
    private JSONObject getRequestBody(HttpServletRequest request) throws IOException {
        try{
            StringBuilder stringBuilder = new StringBuilder();
            InputStream inputStream = request.getInputStream();
            byte[] bs = new byte[StreamUtils.BUFFER_SIZE];
            int len;
            while((len = inputStream.read(bs)) != -1){
                stringBuilder.append(new String(bs, 0 , len));
            }
            return JSON.parseObject(stringBuilder.toString());
        }catch (IOException e){
            log.error("get request body error.");
        }
        throw new AuthenticationServiceException("invalid request body");
    }

    /**
     * 校验用户名和密码
     */
    private void ValidateUsernameAndPassword(String username, String password) throws AuthenticationException {
        UserInfo userInfo = userInfoService.queryUserInfoByName(username);
        if (userInfo == null){
            throw new UsernameNotFoundException("user not exist");
        }
        if(!userInfo.getPassword().equals(Md5Utils.md5(password + userInfo.getSalt()))){
            throw new AuthenticationServiceException("error username or password");
        }
    }
}
