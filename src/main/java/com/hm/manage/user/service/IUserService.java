package com.hm.manage.user.service;

import com.hm.common.entity.ClownResult;
import com.hm.manage.user.model.UserGroupBo;
import com.hm.manage.user.model.UserGroupRoleBo;
import com.hm.manage.user.model.UserGroupUserInfoBo;
import com.hm.manage.user.model.UserRoleBo;

import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IUserService {

    /**
     *@描述 新增、修改用户组表数据信息
     *@参数 UserGroupBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addUserGroupInfo(UserGroupBo userGroupBo);

    /**
     *@描述 查询用户组表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getUserGroupInfoById(Long id);

    /**
     *@描述 查询用户组表列表信息
     *@参数 param
     *@返回值
     *@创建人 clown
     *@创建时间 2020/6/19
     */
    public ClownResult queryUserGroupList(Map<String, Object> param);

    /**
     *@描述 删除用户组表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteUserGroupInfoById(Long id);

    /**
     *@描述 新增、修改用户组与角色关联表数据信息
     *@参数 UserGroupRoleBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addUserGroupRoleInfo(UserGroupRoleBo userGroupRoleBo);

    /**
     *@描述 查询用户组与角色关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getUserGroupRoleInfoById(Long id);

    /**
     *@描述 删除用户组与角色关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteUserGroupRoleInfoById(Long id);

    /**
     *@描述 新增、修改用户组与用户信息关联表数据信息
     *@参数 UserGroupUserInfoBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addUserGroupUserInfo(UserGroupUserInfoBo userGroupUserInfoBo);

    /**
     *@描述 查询用户组与用户信息关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getUserGroupUserInfoById(Long id);

    /**
     *@描述 删除用户组与用户信息关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteUserGroupUserInfoById(Long id);

    /**
     *@描述 新增、修改用户与角色关联表数据信息
     *@参数 UserRoleBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addUserRoleInfo(UserRoleBo userRoleBo);

    /**
     *@描述 查询用户与角色关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getUserRoleInfoById(Long id);

    /**
     *@描述 删除用户与角色关联表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteUserRoleInfoById(Long id);
}
