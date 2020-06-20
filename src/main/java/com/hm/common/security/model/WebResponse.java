package com.hm.common.security.model;

import com.hm.common.security.constant.CommonResponse;
import com.hm.common.security.constant.HttpResponseStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebResponse {
    private String code;
    private String message;
    private Object result;

    public WebResponse(HttpResponseStatusEnum httpResponseStatusEnum) {
        this.code = httpResponseStatusEnum.getCode();
        this.message = httpResponseStatusEnum.getMessage();
    }

    public WebResponse(CommonResponse commonResponse) {
        this.code = commonResponse.getCode();
        this.message = commonResponse.getMessage();
    }

    /**
     * 成功响应
     */
    public static WebResponse success() {
        return new WebResponse(HttpResponseStatusEnum.SUCCESS.getCode(), HttpResponseStatusEnum.SUCCESS.getMessage(), null);
    }

    /**
     * 成功响应
     */
    public static WebResponse success(Object result) {
        return new WebResponse(HttpResponseStatusEnum.SUCCESS.getCode(), HttpResponseStatusEnum.SUCCESS.getMessage(), result);
    }

    /**
     * 禁止操作
     */
    public static WebResponse forbidden() {
        return new WebResponse(HttpResponseStatusEnum.FORBIDDEN_OPERATION.getCode(), HttpResponseStatusEnum.FORBIDDEN_OPERATION.getMessage(), null);
    }
}
