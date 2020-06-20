package com.hm.manage.pageElement.model;

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
public class PageElementBo implements Serializable {
    private Long id;// 页面元素表
    private String pageElementName;// 页面元素名称
}
