package com.hm.manage.operation.model;

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
public class OperationBo implements Serializable {
    private Long id;// 功能操作表
    private String operationName;// 操作名称
    private String operationCode;// 操作编码
    private String ljUrlQz;// 拦截URL前缀
    private Long parentId;// 操作父ID
}
