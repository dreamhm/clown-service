package com.hm.manage.user.model;

import com.hm.serve.userInfo.model.UserInfo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

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
    private List<UserInfo> children;// 用户信息
}
