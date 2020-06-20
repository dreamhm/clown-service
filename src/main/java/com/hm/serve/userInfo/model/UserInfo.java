package com.hm.serve.userInfo.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
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
public class UserInfo implements Serializable {
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;// 用户信息表
    private String username;// 用户名
    private String password;//用户密码
    private String salt;//密码盐
}
