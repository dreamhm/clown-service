package com.hm.serve.userInfo.dao;

import com.hm.serve.userInfo.model.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IUserInfoDao {

    /**
     *@描述 新增用户信息
     *@参数 UserInfo
     *@返回值 影响行数
     *@创建人 haomiao
     *@创建时间 2020/2/11
     */
    public int insertUserInfo(UserInfo userInfo);

    /**
     *@描述 修改用户信息
     *@参数 UserInfo
     *@返回值 影响行数
     *@创建人 haomiao
     *@创建时间 2020/2/15
     */
    public int updateUserInfo(UserInfo userInfo);
    /**
     *@描述 查询用户信息
     *@参数 id
     *@返回值 用户信息
     *@创建人 haomiao
     *@创建时间 2020/2/12
     */
    public UserInfo selectUserInfoById(Long id);

    /**
     *@描述 查询用户信息
     *@参数 username
     *@返回值 用户信息
     *@创建人 haomiao
     *@创建时间 2020/3/1
     */
    public UserInfo selectUserInfoByName(String username);

   /**
    *@描述 查询用户列表信息
    *@参数 param
    *@创建人 haomiao
    *@创建时间 2020/4/28
    */
    List<UserInfo> selectUserList(Map<String, Object> param);

    /**
     *@描述 删除用户信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/15
     */
    public int delUserInfoById(Long id);

}
