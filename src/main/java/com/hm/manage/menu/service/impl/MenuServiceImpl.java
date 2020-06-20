package com.hm.manage.menu.service.impl;

import com.hm.common.entity.ClownResult;
import com.hm.common.utils.ClownResultUtil;
import com.hm.common.utils.SnowFlake;
import com.hm.manage.menu.dao.IMenuDao;
import com.hm.manage.menu.model.MenuBo;
import com.hm.manage.menu.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("menuService")
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private IMenuDao menuDao;

    public ClownResult addMenuInfo(MenuBo menuBo) {
        int retrunCode = 0;
        if(menuBo.getId() == null || menuBo.getId().equals("")){
            menuBo.setId(SnowFlake.genId());
            retrunCode = menuDao.insertMenuInfo(menuBo);
        }else{
            retrunCode = menuDao.updateMenuInfo(menuBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getMenuInfo(Long id) {
        MenuBo menuBo = menuDao.selectMenuById(id);
        return ClownResultUtil.getClowenResultByData(menuBo);
    }

    public ClownResult deleteMenuInfo(Long id) {
        int returnCode = menuDao.deleteMenuById(id);
        return ClownResultUtil.equalsNumberIsZero(returnCode);
    }
}
