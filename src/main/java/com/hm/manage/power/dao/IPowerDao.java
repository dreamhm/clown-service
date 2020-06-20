package com.hm.manage.power.dao;

import com.hm.manage.power.model.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IPowerDao {

    /**
     *@描述 新增权限表数据信息
     *@参数 PowerBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertPowerInfo(PowerBo powerBo);

    /**
     *@描述 修改权限表数据信息
     *@参数 PowerBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updatePowerInfo(PowerBo powerBo);

    /**
     *@描述 查询权限表数据信息
     *@参数 id
     *@返回值 PowerBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public PowerBo selectPowerInfoById(Long id);

    /**
     *@描述 删除权限表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delPowerInfoById(Long id);

    /**
     *@描述 新增权限与文件关联表数据信息
     *@参数 PowerFileBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertPowerFileInfo(PowerFileBo powerFileBo);

    /**
     *@描述 修改权限与文件关联表数据信息
     *@参数 PowerFileBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updatePowerFileInfo(PowerFileBo powerFileBo);

    /**
     *@描述 查询权限与文件关联表数据信息
     *@参数 id
     *@返回值 PowerFileBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public PowerFileBo selectPowerFileInfoById(Long id);

    /**
     *@描述 删除权限与文件关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delPowerFileInfoById(Long id);

    /**
     *@描述 新增权限与菜单关联表数据信息
     *@参数 PowerMenuBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertPowerMenuInfo(PowerMenuBo powerMenuBo);

    /**
     *@描述 修改权限与菜单关联表数据信息
     *@参数 PowerMenuBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updatePowerMenuInfo(PowerMenuBo powerMenuBo);

    /**
     *@描述 查询权限与菜单关联表数据信息
     *@参数 id
     *@返回值 PowerMenuBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public PowerMenuBo selectPowerMenuInfoById(Long id);

    /**
     *@描述 删除权限与菜单关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delPowerMenuInfoById(Long id);

    /**
     *@描述 新增权限与功能操作关联表数据信息
     *@参数 PowerOperationBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertPowerOperationInfo(PowerOperationBo powerOperationBo);

    /**
     *@描述 修改权限与功能操作关联表数据信息
     *@参数 PowerOperationBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updatePowerOperationInfo(PowerOperationBo powerOperationBo);

    /**
     *@描述 查询权限与功能操作关联表数据信息
     *@参数 id
     *@返回值 PowerOperationBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public PowerOperationBo selectPowerOperationInfoById(Long id);

    /**
     *@描述 删除权限与功能操作关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delPowerOperationInfoById(Long id);

    /**
     *@描述 新增权限与页面元素关联表数据信息
     *@参数 PowerPageBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertPowerPageInfo(PowerPageBo powerPageBo);

    /**
     *@描述 修改权限与页面元素关联表数据信息
     *@参数 PowerPageBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updatePowerPageInfo(PowerPageBo powerPageBo);

    /**
     *@描述 查询权限与页面元素关联表数据信息
     *@参数 id
     *@返回值 PowerPageBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public PowerPageBo selectPowerPageInfoById(Long id);

    /**
     *@描述 删除权限与页面元素关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delPowerPageInfoById(Long id);
}
