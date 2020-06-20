package com.hm.manage.user.model;

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
public class UserGroupUserInfoBo implements Serializable {
    private Long id;// 用户组与用户信息关联表
    private Long userGroupId;// 用户组ID
    private Long userId;// 用户ID
}
