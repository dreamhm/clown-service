package com.hm.manage.power.model;

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
public class PowerBo implements Serializable {
    private Long id;// 权限表
    private String powerType;// 权限类型
}
