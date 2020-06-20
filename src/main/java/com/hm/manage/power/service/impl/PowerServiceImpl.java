package com.hm.manage.power.service.impl;

import com.hm.common.entity.ClownResult;
import com.hm.common.utils.ClownResultUtil;
import com.hm.common.utils.SnowFlake;
import com.hm.manage.power.dao.IPowerDao;
import com.hm.manage.power.model.*;
import com.hm.manage.power.service.IPowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("powerService")
public class PowerServiceImpl implements IPowerService {

    @Autowired
    private IPowerDao powerDao;

    public ClownResult addPowerInfo(PowerBo powerBo) {
        int retrunCode = 0;
        if(powerBo.getId() == null || powerBo.getId().equals("")){
            powerBo.setId(SnowFlake.genId());
            retrunCode = powerDao.insertPowerInfo(powerBo);
        }else {
            retrunCode = powerDao.updatePowerInfo(powerBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getPowerInfo(Long id) {
        PowerBo powerBo = powerDao.selectPowerInfoById(id);
        return ClownResultUtil.getClowenResultByData(powerBo);
    }

    public ClownResult deletePowerInfo(Long id) {
        int retrunCode = powerDao.delPowerInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addPowerFileInfo(PowerFileBo powerFileBo) {
        int retrunCode = 0;
        if(powerFileBo.getId() == null || powerFileBo.getId().equals("")){
            powerFileBo.setId(SnowFlake.genId());
            retrunCode = powerDao.insertPowerFileInfo(powerFileBo);
        }else {
            retrunCode = powerDao.updatePowerFileInfo(powerFileBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getPowerFileInfo(Long id) {
        PowerFileBo powerFileBo = powerDao.selectPowerFileInfoById(id);
        return ClownResultUtil.getClowenResultByData(powerFileBo);
    }

    public ClownResult deletePowerFileInfo(Long id) {
        int retrunCode = powerDao.delPowerFileInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addPowerMenuInfo(PowerMenuBo powerMenuBo) {
        int retrunCode = 0;
        if(powerMenuBo.getId() == null || powerMenuBo.getId().equals("")){
            powerMenuBo.setId(SnowFlake.genId());
            retrunCode = powerDao.insertPowerMenuInfo(powerMenuBo);
        }else {
            retrunCode = powerDao.updatePowerMenuInfo(powerMenuBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getPowerMenuInfo(Long id) {
        PowerMenuBo powerMenuBo = powerDao.selectPowerMenuInfoById(id);
        return ClownResultUtil.getClowenResultByData(powerMenuBo);
    }

    public ClownResult deletePowerMenuInfo(Long id) {
        int retrunCode = powerDao.delPowerMenuInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addPowerOperationInfo(PowerOperationBo powerOperationBo) {
        int retrunCode = 0;
        if(powerOperationBo.getId() == null || powerOperationBo.getId().equals("")){
            powerOperationBo.setId(SnowFlake.genId());
            retrunCode = powerDao.insertPowerOperationInfo(powerOperationBo);
        }else {
            retrunCode = powerDao.updatePowerOperationInfo(powerOperationBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getPowerOperationInfo(Long id) {
        PowerOperationBo powerOperationBo = powerDao.selectPowerOperationInfoById(id);
        return ClownResultUtil.getClowenResultByData(powerOperationBo);
    }

    public ClownResult deletePowerOperationInfo(Long id) {
        int retrunCode = powerDao.delPowerOperationInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addPowerPageInfo(PowerPageBo powerPageBo) {
        int retrunCode = 0;
        if(powerPageBo.getId() == null || powerPageBo.getId().equals("")){
            powerPageBo.setId(SnowFlake.genId());
            retrunCode = powerDao.insertPowerPageInfo(powerPageBo);
        }else {
            retrunCode = powerDao.updatePowerPageInfo(powerPageBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getPowerPageInfo(Long id) {
        PowerPageBo powerPageBo = powerDao.selectPowerPageInfoById(id);
        return ClownResultUtil.getClowenResultByData(powerPageBo);
    }

    public ClownResult deletePowerPageInfo(Long id) {
        int retrunCode = powerDao.delPowerPageInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }
}
