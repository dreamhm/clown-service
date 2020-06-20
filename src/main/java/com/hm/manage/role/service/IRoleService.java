package com.hm.manage.role.service;

import com.hm.common.entity.ClownResult;
import com.hm.manage.role.model.RoleBo;
import com.hm.manage.role.model.RolePowerBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IRoleService {

    /**
     *@描述 新增、修改角色表数据信息
     *@参数 RoleBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addRoleInfo(RoleBo roleBo);

    /**
     *@描述 查看角色表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getRoleInfoById(Long id);

    /**
     *@描述 删除角色表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteRoleInfoById(Long id);

    /**
     *@描述 新增、修改角色与权限关联表数据信息
     *@参数 RolePowerBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addRolePowerInfo(RolePowerBo rolePowerBo);

    /**
     *@描述 查询角色与权限关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getRolePowerInfoById(Long id);

    /**
     *@描述 删除角色与权限关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteRolePowerInfoById(Long id);
}
