package com.hm.common.security.config;

import com.alibaba.fastjson.JSON;
import com.hm.common.security.model.WebResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:退出成功处理器
 */
public class CustomLogoutSuccessHandler implements LogoutSuccessHandler {

    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
                                Authentication authentication) throws IOException, ServletException {
        WebResponse httpServletResponse = WebResponse.success("退出成功");
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        response.getWriter().write(JSON.toJSONString(httpServletResponse));
    }
}
