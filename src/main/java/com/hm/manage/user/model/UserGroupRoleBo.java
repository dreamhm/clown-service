package com.hm.manage.user.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Setter
@Getter
public class UserGroupRoleBo implements Serializable {
    private Long id;// 用户组与角色关联表
    private Long usergroupId;// 用户组ID
    private Long roleId;// 角色ID
}
