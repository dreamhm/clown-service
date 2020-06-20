package com.hm.manage.pageElement.service.impl;

import com.hm.common.entity.ClownResult;
import com.hm.common.utils.ClownResultUtil;
import com.hm.common.utils.SnowFlake;
import com.hm.manage.pageElement.dao.IPageElementDao;
import com.hm.manage.pageElement.model.PageElementBo;
import com.hm.manage.pageElement.service.IPageElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("pageElementService")
public class PageElementServiceImpl implements IPageElementService {

    @Autowired
    private IPageElementDao pageElementDao;

    public ClownResult addPageElementInfo(PageElementBo pageElementBo) {
        int retrunCode = 0;
        if(pageElementBo.getId() == null || pageElementBo.getId().equals("")){
            pageElementBo.setId(SnowFlake.genId());
            retrunCode = pageElementDao.insertPageElementInfo(pageElementBo);
        }else {
            retrunCode = pageElementDao.updatePageElementInfo(pageElementBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getPageElementInfo(Long id) {
        PageElementBo pageElementBo = pageElementDao.selectPageElementInfoById(id);
        return ClownResultUtil.getClowenResultByData(pageElementBo);
    }

    public ClownResult deletePageElementInfo(Long id) {
        int retrunCode = pageElementDao.delPageElementInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }
}
