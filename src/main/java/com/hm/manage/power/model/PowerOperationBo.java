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
public class PowerOperationBo implements Serializable {
    private Long id;// 权限与功能操作关联表
    private Long powerId;// 权限ID
    private Long operationId;// 操作ID
}
