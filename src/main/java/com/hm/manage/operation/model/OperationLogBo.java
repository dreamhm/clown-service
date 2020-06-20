package com.hm.manage.operation.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Setter
@Getter
public class OperationLogBo implements Serializable {
    private Long id;// 操作日志表
    private Long operationTypeId;// 操作类型ID
    private String operationContent;// 操作内容
    private Long operationUserId;// 操作用户ID
    private Date operationTime;// 操作时间
}
