package com.hm.manage.user.dao;

import com.hm.manage.user.model.UserGroupBo;
import com.hm.manage.user.model.UserGroupRoleBo;
import com.hm.manage.user.model.UserGroupUserInfoBo;
import com.hm.manage.user.model.UserRoleBo;

import java.util.List;
import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IUserDao {

    /**
     *@描述 新增用户组表数据信息
     *@参数 UserGroupBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertUserGroupInfo(UserGroupBo userGroupBo);

    /**
     *@描述 修改用户组表数据信息
     *@参数 UserGroupBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateUserGroupInfo(UserGroupBo userGroupBo);

    /**
     *@描述 查询用户组表数据信息
     *@参数 id
     *@返回值 UserGroupBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public UserGroupBo selectUserGroupInfoById(Long id);

    /**
     *@描述 查询用户组表列表信息
     *@参数 param
     *@返回值 List<UserGroupBo>
     *@创建人 clown
     *@创建时间 2020/6/19
     */
    public List<UserGroupBo> selectUserGroupList(Map<String, Object> param);

    /**
     *@描述 删除用户组表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delUserGroupInfoById(Long id);

    /**
     *@描述 新增用户组与角色关联表数据信息
     *@参数 UserGroupRoleBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertUserGroupRoleInfo(UserGroupRoleBo userGroupRoleBo);

    /**
     *@描述 修改用户组与角色关联表数据信息
     *@参数 UserGroupRoleBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateUserGroupRoleInfo(UserGroupRoleBo userGroupRoleBo);

    /**
     *@描述 查询用户组与角色关联表数据信息
     *@参数 id
     *@返回值 UserGroupRoleBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public UserGroupRoleBo selectUserGroupRoleInfoById(Long id);

    /**
     *@描述 删除用户组与角色关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delUserGroupRoleInfoById(Long id);

    /**
     *@描述 新增用户组与用户信息关联表数据信息
     *@参数 UserGroupUserInfoBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertUserGroupUserInfo(UserGroupUserInfoBo userGroupUserInfoBo);

    /**
     *@描述 修改用户组与用户信息关联表数据信息
     *@参数 UserGroupUserInfoBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateUserGroupUserInfo(UserGroupUserInfoBo userGroupUserInfoBo);

    /**
     *@描述 查询用户组与用户信息关联表数据信息
     *@参数 id
     *@返回值 UserGroupUserInfoBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public UserGroupUserInfoBo selectUserGroupUserInfoById(Long id);

    /**
     *@描述 删除用户组与用户信息关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delUserGroupUserInfoById(Long id);

    /**
     *@描述 新增用户与角色关联表数据信息
     *@参数 UserRoleBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertUserRoleInfo(UserRoleBo userRoleBo);

    /**
     *@描述 修改用户与角色关联表数据信息
     *@参数 UserRoleBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateUserRoleInfo(UserRoleBo userRoleBo);

    /**
     *@描述 查询用户与角色关联表数据信息
     *@参数 id
     *@返回值 UserRoleBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public UserRoleBo selectUserRoleInfoById(Long id);

    /**
     *@描述 删除用户与角色关联表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delUserRoleInfoById(Long id);
}
