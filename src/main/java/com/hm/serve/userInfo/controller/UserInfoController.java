package com.hm.serve.userInfo.controller;

import com.hm.serve.userInfo.model.UserInfo;
import com.hm.serve.userInfo.service.IUserInfoService;
import com.hm.common.entity.ClownResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clUserInfo")
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;
    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/userInfo/addUserInfo")
    public ClownResult addUserInfo(@RequestBody UserInfo userInfo){
        return userInfoService.addUserInfo(userInfo);
    }

    @GetMapping("/userInfo/{id}")
    public ClownResult queryUserInfoById(@PathVariable("id") Long id){
        return userInfoService.queryUserInfoById(id);
    }

    @PostMapping("/userInfo/queryUserList")
    public ClownResult queryUserList(@RequestBody Map<String, Object> param){
        return userInfoService.queryUserList(param);
    }

    @DeleteMapping("/userInfo/{id}")
    public ClownResult deleteUserInfoById(@PathVariable("id") Long id){
        return userInfoService.delUserInfoById(id);
    }

    @PostMapping("/userInfo/login")
    public ClownResult refreshAndGetAuthenticationToken(@RequestBody Map<String, String> userInfo) {
        return userInfoService.loadUserByUsername(userInfo.get("username"), userInfo.get("password"));
    }

    @GetMapping("/userInfo/register")
    public ClownResult register(@RequestParam ("token") String token) {
        return userInfoService.getToken(token);
    }
}
