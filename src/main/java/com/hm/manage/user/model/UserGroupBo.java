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
public class UserGroupBo implements Serializable {
    private Long id;// 用户组表
    private String userGroupName;// 用户组名
}
