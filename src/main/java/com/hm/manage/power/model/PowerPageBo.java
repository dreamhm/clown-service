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
public class PowerPageBo implements Serializable {
    private Long id;// 权限与页面元素关联表
    private Long powerId;// 缺陷ID
    private Long pageId;// 页面元素ID
}
