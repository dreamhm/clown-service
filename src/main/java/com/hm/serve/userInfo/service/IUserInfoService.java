package com.hm.serve.userInfo.service;

import com.hm.serve.userInfo.model.UserInfo;
import com.hm.common.entity.ClownResult;

import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IUserInfoService {

    /**
     *@描述 新增\修改人员信息
     *@参数 userInfo
     *@创建人 haomiao
     *@创建时间 2020/2/11
     */
    public ClownResult addUserInfo(UserInfo userInfo);

    /**
     *@描述 查询人员信息
     *@参数 id 人员主键
     *@创建人 haomiao
     *@创建时间 2020/2/12
     */
    public ClownResult queryUserInfoById(Long id);

    /**
     *@描述 查询人员信息
     *@参数 username 人员名称
     *@创建人 haomiao
     *@创建时间 2020/3/1
     */
    UserInfo queryUserInfoByName(String username);

   /**
    *@描述 查询人员列表信息
    *@参数 param 请求参数集合
    *@创建人 haomiao
    *@创建时间 2020/4/28
    */
    ClownResult queryUserList(Map<String, Object> param);

    /**
     *@描述 删除人员信息
     *@参数 id 人员主键
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/15
     */
    public ClownResult delUserInfoById(Long id);

    /**
     *@描述 用户登录请求
     *@参数 username 人员账号
     *@参数 password 人员密码
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/6/15
     */
    ClownResult loadUserByUsername(String username, String password);

    /**
     *@描述 TODO
     *@参数 
     *@返回值 
     *@创建人 clown
     *@创建时间 2020/6/15
     */
    ClownResult getToken(String token);
}
