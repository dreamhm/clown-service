package com.hm.manage.pageElement.service;

import com.hm.common.entity.ClownResult;
import com.hm.manage.pageElement.model.PageElementBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IPageElementService {

    /**
     *@描述 新增、修改页面元素表数据信息
     *@参数 pageElementBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addPageElementInfo(PageElementBo pageElementBo);

    /**
     *@描述 获取页面元素表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getPageElementInfo(Long id);

    /**
     *@描述 删除页面元素表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deletePageElementInfo(Long id);
}
