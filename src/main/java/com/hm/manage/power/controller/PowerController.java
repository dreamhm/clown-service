package com.hm.manage.power.controller;

import com.hm.common.entity.ClownResult;
import com.hm.manage.power.model.*;
import com.hm.manage.power.service.IPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clPower")
public class PowerController {

    @Autowired
    private IPowerService powerService;

    /*table - [Power]*/
    @PostMapping("/power/addPowerInfo")
    public ClownResult addPowerInfo(@RequestBody PowerBo powerBo){
        return powerService.addPowerInfo(powerBo);
    }

    @GetMapping("/power/{id}")
    public ClownResult getPowerInfo(@PathVariable("id") Long id){
        return powerService.getPowerInfo(id);
    }

    @DeleteMapping("/power/{id}")
    public ClownResult deletePowerInfo(@PathVariable("id") Long id){
        return powerService.deletePowerInfo(id);
    }

    /*table - [PowerFile]*/
    @PostMapping("/powerFile/addPowerInfo")
    public ClownResult addPowerFileInfo(@RequestBody PowerFileBo powerFileBo){
        return powerService.addPowerFileInfo(powerFileBo);
    }

    @GetMapping("/powerFile/{id}")
    public ClownResult getPowerFileInfo(@PathVariable("id") Long id){
        return powerService.getPowerFileInfo(id);
    }

    @DeleteMapping("/powerFile/{id}")
    public ClownResult deletePowerFileInfo(@PathVariable("id") Long id){
        return powerService.deletePowerFileInfo(id);
    }

    /*table - [PowerMenu]*/
    @PostMapping("/powerMenu/addPowerMenuInfo")
    public ClownResult addPowerMenuInfo(@RequestBody PowerMenuBo powerMenuBo){
        return powerService.addPowerMenuInfo(powerMenuBo);
    }

    @GetMapping("/powerMenu/{id}")
    public ClownResult getPowerMenuInfo(@PathVariable("id") Long id){
        return powerService.getPowerMenuInfo(id);
    }

    @DeleteMapping("/powerMenu/{id}")
    public ClownResult deletePowerMenuInfo(@PathVariable("id") Long id) {
        return powerService.deletePowerMenuInfo(id);
    }

    /*table - [PowerOperation]*/
    @PostMapping("/powerOperation/addPowerOperationInfo")
    public ClownResult addPowerOperationInfo(@RequestBody PowerOperationBo powerOperationBo){
        return powerService.addPowerOperationInfo(powerOperationBo);
    }

    @GetMapping("/powerOperation/{id}")
    public ClownResult getPowerOperationInfo(@PathVariable("id") Long id){
        return powerService.getPowerOperationInfo(id);
    }

    @DeleteMapping("/powerOperation/{id}")
    public ClownResult deletePowerOperationInfo(@PathVariable("id") Long id) {
        return powerService.deletePowerOperationInfo(id);
    }

    /*table - [PowerPage]*/
    @PostMapping("/powerPage/addPowerPageInfo")
    public ClownResult addPowerPageInfo(@RequestBody PowerPageBo powerPageBo){
        return powerService.addPowerPageInfo(powerPageBo);
    }

    @GetMapping("/powerPage/{id}")
    public ClownResult getPowerPageInfo(@PathVariable("id") Long id){
        return powerService.getPowerPageInfo(id);
    }

    @DeleteMapping("/powerPage/{id}")
    public ClownResult deletePowerPageInfo(@PathVariable("id") Long id) {
        return powerService.deletePowerPageInfo(id);
    }

}
