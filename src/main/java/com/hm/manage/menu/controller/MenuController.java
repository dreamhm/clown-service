package com.hm.manage.menu.controller;

import com.hm.common.entity.ClownResult;
import com.hm.manage.menu.model.MenuBo;
import com.hm.manage.menu.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clMenu")
public class MenuController {

    @Autowired
    private IMenuService menuService;

    @PostMapping("/menu/addMenuInfo")
    public ClownResult addMenuInfo(@RequestBody MenuBo menuBo){
        return menuService.addMenuInfo(menuBo);
    }

    @GetMapping("/menu/{id}")
    public ClownResult getMenuInfo(@PathVariable("id") Long id){
        return menuService.getMenuInfo(id);
    }

    @DeleteMapping("/menu/{id}")
    public ClownResult deleteMenuInfo(@PathVariable("id") Long id){
        return menuService.deleteMenuInfo(id);
    }
}
