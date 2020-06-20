package com.hm.manage.power.service;

import com.hm.common.entity.ClownResult;
import com.hm.manage.power.model.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IPowerService {
    
    /**
     *@描述 新增、修改权限表数据信息
     *@参数 powerBo
     *@返回值 
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addPowerInfo(PowerBo powerBo);

    /**
     *@描述 获取权限表数据信息
     *@参数 id
     *@返回值 
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getPowerInfo(Long id);

    /**
     *@描述 删除权限表数据信息
     *@参数 id
     *@返回值 
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    ClownResult deletePowerInfo(Long id);

    /**
     *@描述 新增、修改权限与文件关联表数据信息
     *@参数 PowerFileBo
     *@返回值 
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addPowerFileInfo(PowerFileBo powerFileBo);

    /**
     *@描述 获取权限与文件关联表数据信息
     *@参数 id
     *@返回值 
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getPowerFileInfo(Long id);

    /**
     *@描述 删除权限与文件关联表数据信息
     *@参数 id
     *@返回值 
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deletePowerFileInfo(Long id);

    /**
     *@描述 新增、修改权限与菜单关联表数据信息
     *@参数 PowerMenuBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addPowerMenuInfo(PowerMenuBo powerMenuBo);

    /**
     *@描述 获取权限与菜单关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getPowerMenuInfo(Long id);

    /**
     *@描述 删除权限与菜单关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deletePowerMenuInfo(Long id);

    /**
     *@描述 新增、修改权限与功能操作关联表数据信息
     *@参数 PowerOperationBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addPowerOperationInfo(PowerOperationBo powerOperationBo);

    /**
     *@描述 获取权限与功能操作关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getPowerOperationInfo(Long id);

    /**
     *@描述 删除权限与功能操作关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deletePowerOperationInfo(Long id);

    /**
     *@描述 新增、修改权限与页面元素关联表数据信息
     *@参数 PowerPageBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addPowerPageInfo(PowerPageBo powerPageBo);

    /**
     *@描述 获取权限与页面元素关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getPowerPageInfo(Long id);

    /**
     *@描述 删除权限与页面元素关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deletePowerPageInfo(Long id);
}
