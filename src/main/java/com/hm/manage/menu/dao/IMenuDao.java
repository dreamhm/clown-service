package com.hm.manage.menu.dao;

import com.hm.manage.menu.model.MenuBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IMenuDao {
    /**
     *@描述 新增菜单信息
     *@参数 menuBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public int insertMenuInfo(MenuBo menuBo);

    /**
     *@描述 修改菜单信息
     *@参数 menuBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public int updateMenuInfo(MenuBo menuBo);

    /**
     *@描述 查询菜单信息
     *@参数 id
     *@返回值 menuBo
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public MenuBo selectMenuById(Long id);

    /**
     *@描述 删除菜单信息
     *@参数 id
     *@返回值 menuBo
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public int deleteMenuById(Long id);
}
