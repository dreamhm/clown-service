package com.hm.manage.pageElement.dao;

import com.hm.manage.pageElement.model.PageElementBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IPageElementDao {

    /**
     *@描述 新增页面元素表数据信息
     *@参数 pageElementBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertPageElementInfo(PageElementBo pageElementBo);

    /**
     *@描述 修改页面元素表数据信息
     *@参数 pageElementBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updatePageElementInfo(PageElementBo pageElementBo);

    /**
     *@描述 查询页面元素表数据信息
     *@参数 id
     *@返回值 PageElementBo
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public PageElementBo selectPageElementInfoById(Long id);

    /**
     *@描述 删除页面元素表数据信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delPageElementInfoById(Long id);
}
