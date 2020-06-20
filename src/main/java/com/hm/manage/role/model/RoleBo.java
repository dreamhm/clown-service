package com.hm.manage.role.model;import lombok.Getter;import lombok.Setter;import java.io.Serializable;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Setter
@Getter
public class RoleBo implements Serializable {
    private Long id;// 角色表
    private String roleName;// 角色
}
