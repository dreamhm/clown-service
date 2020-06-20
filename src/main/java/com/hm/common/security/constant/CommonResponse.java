package com.hm.common.security.constant;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:通用响应体
 */
public interface CommonResponse {

    /**
     * 获取状态码
     */
    String getCode();

    /**
     * 获取消息
     */
    String getMessage();

    /**
     * 响应结果
     */
    Object getResult();
}
