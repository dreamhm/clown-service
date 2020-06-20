package com.hm.manage.role.model;

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
public class RolePowerBo implements Serializable {
    private Long id;// 角色与权限关联表
    private Long roleId;// 角色ID
    private Long powerId;// 权限ID
}
