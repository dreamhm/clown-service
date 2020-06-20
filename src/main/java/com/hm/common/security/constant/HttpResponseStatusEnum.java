package com.hm.common.security.constant;

import lombok.AllArgsConstructor;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@AllArgsConstructor
public enum HttpResponseStatusEnum implements CommonResponse {

    SUCCESS("0", "success"),                            // 成功请求
    FORBIDDEN_OPERATION("2", "forbidden");              // 权限不足

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getResult() {
        return null;
    }

}
