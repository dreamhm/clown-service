package com.hm.manage.role.dao;

import com.hm.manage.role.model.RoleBo;
import com.hm.manage.role.model.RolePowerBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IRoleDao {

    /**
     *@描述 新增角色表数据信息
     *@参数 RoleBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertRoleInfo(RoleBo roleBo);

    /**
     *@描述 修改角色表数据信息
     *@参数 RoleBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateRoleInfo(RoleBo roleBo);

    /**
     *@描述 查询角色表数据信息
     *@参数 id
     *@返回值 RoleBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public RoleBo selectRoleInfoById(Long id);

    /**
     *@描述 删除角色表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delRoleInfoById(Long id);

    /**
     *@描述 新增角色与权限关联表数据信息
     *@参数 RolePowerBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertRolePowerInfo(RolePowerBo rolePowerBo);

    /**
     *@描述 修改角色与权限关联表数据信息
     *@参数 RolePowerBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateRolePowerInfo(RolePowerBo rolePowerBo);

    /**
     *@描述 查询角色与权限关联表数据信息
     *@参数 id
     *@返回值 RolePowerBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public RolePowerBo selectRolePowerInfoById(Long id);

    /**
     *@描述 删除角色与权限关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delRolePowerInfoById(Long id);
}
