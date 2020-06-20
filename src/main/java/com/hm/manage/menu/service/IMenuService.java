package com.hm.manage.menu.service;

import com.hm.common.entity.ClownResult;
import com.hm.manage.menu.model.MenuBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IMenuService {
    /**
     *@描述 新增、修改菜单信息
     *@参数 menuBo
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public ClownResult addMenuInfo(MenuBo menuBo);

    /**
     *@描述 查询菜单信息
     *@参数 id
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public ClownResult getMenuInfo(Long id);

    /**
     *@描述 删除菜单信息
     *@参数 id
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public ClownResult deleteMenuInfo(Long id);

}
