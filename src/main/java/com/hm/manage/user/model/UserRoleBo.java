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
public class UserRoleBo implements Serializable {
    private Long id;// 用户与角色关联表
    private Long userId;// 用户ID
    private Long roleId;// 角色ID
}
