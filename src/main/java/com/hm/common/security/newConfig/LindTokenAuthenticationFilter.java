package com.hm.common.security.newConfig;

import com.hm.common.entity.ClownConstant;
import com.hm.common.utils.CacheUtils;
import com.hm.serve.userInfo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class LindTokenAuthenticationFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String authHeader = request.getHeader(ClownConstant.tokenHeader);
        if (authHeader != null && authHeader.startsWith(ClownConstant.tokenHead)) {//authHeader 不为null并以指定字符开头
            UserInfo userinfo = CacheUtils.getBean(authHeader, UserInfo.class);
            final String authToken = authHeader.substring(ClownConstant.tokenHead.length());
            if(authToken != null && userinfo != null){
                String username = userinfo.getUsername();
                if(username != null && SecurityContextHolder.getContext().getAuthentication() == null){
                    //可以校验token和username是否有效，目前由于token对应username存在redis，都以默认都是有效的
                    List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<>();
                    simpleGrantedAuthorities.add(new SimpleGrantedAuthority("USER"));
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(username, userinfo.getPassword(), simpleGrantedAuthorities);
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    logger.info("authenticated user " + username + ", setting security context");
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
            System.out.println("我行我素 " + authToken);
        }else{
            System.out.println("---[登录到这里了]-----");
            /*UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                    null, null, null);
            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(
                    request));
            logger.info("authenticated user " + null + ", setting security context");
            SecurityContextHolder.getContext().setAuthentication(authentication);*/
        }
        filterChain.doFilter(request, response);
    }

    /*@Autowired
    RedisTemplate<String, String> redisTemplate;
    String tokenHead = "Bearer ";
    String tokenHeader = "Authorization";
    @Autowired
    private UserDetailsService userDetailsService;

    *//**
     * token filter.
     *
     * @param request     .
     * @param response    .
     * @param filterChain .
     *//*
    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        String authHeader = request.getHeader(this.tokenHeader);
        if (authHeader != null && authHeader.startsWith(tokenHead)) {
            final String authToken = authHeader.substring(tokenHead.length()); // The part after "Bearer "
            if (authToken != null && redisTemplate.hasKey(authToken)) {
                String username = redisTemplate.opsForValue().get(authToken);
                if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                    UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                    //可以校验token和username是否有效，目前由于token对应username存在redis，都以默认都是有效的
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                            userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(
                            request));
                    logger.info("authenticated user " + username + ", setting security context");
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }

        filterChain.doFilter(request, response);

    }*/
}