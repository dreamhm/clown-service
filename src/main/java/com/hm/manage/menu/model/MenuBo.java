package com.hm.manage.menu.model;

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
public class MenuBo implements Serializable {
    private Long id;// 菜单表
    private String menuName;// 菜单名称
    private String menuUrl;// 菜单URL
    private Long parentId;// 菜单父ID
}
