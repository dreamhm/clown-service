package com.hm.manage.user.controller;

import com.hm.common.entity.ClownResult;
import com.hm.manage.user.model.UserGroupBo;
import com.hm.manage.user.model.UserGroupRoleBo;
import com.hm.manage.user.model.UserGroupUserInfoBo;
import com.hm.manage.user.model.UserRoleBo;
import com.hm.manage.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clUser")
public class UserController {

    @Autowired
    private IUserService userService;

    /* table - [UserGroupBo]*/
    @PostMapping("/userGroup/addUserGroupInfo")
    public ClownResult addUserGroupInfo(@RequestBody UserGroupBo userGroupBo){
        return userService.addUserGroupInfo(userGroupBo);
    }

    @GetMapping("/userGroup/{id}")
    public ClownResult getUserGroupInfo(@PathVariable("id") Long id){
        return userService.getUserGroupInfoById(id);
    }

    @PostMapping("/userGroup/queryUserGroupList")
    public ClownResult queryUserGroupList(@RequestBody Map<String, Object> param){
        return userService.queryUserGroupList(param);
    }

    @DeleteMapping("/userGroup/{id}")
    public ClownResult deleteUserGroupInfo(@PathVariable("id") Long id){
        return userService.deleteUserGroupInfoById(id);
    }

    /* table - [UserGroupRole]*/
    @PostMapping("/userGroupRole/addUserGroupRoleInfo")
    public ClownResult addUserGroupRoleInfo(@RequestBody UserGroupRoleBo userGroupRoleBo){
        return userService.addUserGroupRoleInfo(userGroupRoleBo);
    }

    @GetMapping("/userGroupRole/{id}")
    public ClownResult getUserGroupRoleInfo(@PathVariable("id") Long id){
        return userService.getUserGroupRoleInfoById(id);
    }

    @DeleteMapping("/userGroupRole/{id}")
    public ClownResult deleteUserGroupRoleInfo(@PathVariable("id") Long id){
        return userService.deleteUserGroupRoleInfoById(id);
    }

    /* table - [UserGroupUserInfo]*/
    @PostMapping("/userGroupUserInfo/addUserGroupUserInfo")
    public ClownResult addUserGroupUserInfo(@RequestBody UserGroupUserInfoBo userGroupUserInfoBo){
        return userService.addUserGroupUserInfo(userGroupUserInfoBo);
    }

    @GetMapping("/userGroupUserInfo/{id}")
    public ClownResult getUserGroupUserInfo(@PathVariable("id") Long id){
        return userService.getUserGroupUserInfoById(id);
    }

    @DeleteMapping("/userGroupUserInfo/{id}")
    public ClownResult deleteUserGroupUserInfo(@PathVariable("id") Long id){
        return userService.deleteUserGroupUserInfoById(id);
    }

    /* table - [UserRole]*/
    @PostMapping("/userRole/addUserRoleInfo")
    public ClownResult addUserRoleInfo(@RequestBody UserRoleBo userRoleBo){
        return userService.addUserRoleInfo(userRoleBo);
    }

    @GetMapping("/userRole/{id}")
    public ClownResult getUserRoleInfo(@PathVariable("id") Long id){
        return userService.getUserRoleInfoById(id);
    }

    @DeleteMapping("/userRole/{id}")
    public ClownResult deleteUserRoleInfo(@PathVariable("id") Long id){
        return userService.deleteUserRoleInfoById(id);
    }
}
