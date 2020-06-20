package com.hm.manage.role.controller;

import com.hm.common.entity.ClownResult;
import com.hm.manage.role.model.RoleBo;
import com.hm.manage.role.model.RolePowerBo;
import com.hm.manage.role.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clRole")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    /*table - [Role]*/
    @PostMapping("/role/addRoleInfo")
    public ClownResult addRoleInfo(@RequestBody RoleBo roleBo){
        return roleService.addRoleInfo(roleBo);
    }

    @GetMapping("/role/{id}")
    public ClownResult getRoleInfo(@PathVariable("id") Long id){
        return roleService.getRoleInfoById(id);
    }

    @DeleteMapping("/role/{id}")
    public ClownResult deleteRoleInfo(@PathVariable("id") Long id){
        return roleService.deleteRoleInfoById(id);
    }

    /*table - [RolePower]*/
    @PostMapping("/rolePower/addRolePowerInfo")
    public ClownResult addRolePowerInfo(@RequestBody RolePowerBo rolePowerBo){
        return roleService.addRolePowerInfo(rolePowerBo);
    }

    @GetMapping("/rolePower/{id}")
    public ClownResult getRolePowerInfo(@PathVariable("id") Long id){
        return roleService.getRolePowerInfoById(id);
    }

    @DeleteMapping("/rolePower/{id}")
    public ClownResult deleteRolePowerInfo(@PathVariable("id") Long id){
        return roleService.deleteRolePowerInfoById(id);
    }
}
