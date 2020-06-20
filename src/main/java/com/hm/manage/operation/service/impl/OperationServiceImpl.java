package com.hm.manage.operation.service.impl;

import com.hm.common.entity.ClownResult;
import com.hm.common.utils.ClownResultUtil;
import com.hm.common.utils.SnowFlake;
import com.hm.manage.operation.dao.IOperationDao;
import com.hm.manage.operation.model.OperationBo;
import com.hm.manage.operation.model.OperationLogBo;
import com.hm.manage.operation.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("operationService")
public class OperationServiceImpl implements IOperationService {

    @Autowired
    private IOperationDao operationDao;

    public ClownResult addOperationInfo(OperationBo operationBo) {
        int retrunCode = 0;
        if(operationBo.getId() == null || operationBo.getId().equals("")){
            operationBo.setId(SnowFlake.genId());
            retrunCode = operationDao.insertOperationInfo(operationBo);
        }else {
            retrunCode = operationDao.updateOperationInfo(operationBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getOperationInfo(Long id) {
        OperationBo operationInfo = operationDao.selectOperationInfoById(id);
        return ClownResultUtil.getClowenResultByData(operationInfo);
    }

    public ClownResult deleteOperationInfo(Long id) {
        int retrunCode = operationDao.delOperationInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult addOperationLogInfo(OperationLogBo operationLogBo) {
        int retrunCode = 0;
        if(operationLogBo.getId() == null || operationLogBo.getId().equals("")){
            operationLogBo.setId(SnowFlake.genId());
            retrunCode = operationDao.insertOperationLogInfo(operationLogBo);
        }else {
            retrunCode = operationDao.updateOperationLogInfo(operationLogBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getOperationLogInfo(Long id) {
        OperationLogBo OperationLogInfo = operationDao.selectOperationLogInfoById(id);
        return ClownResultUtil.getClowenResultByData(OperationLogInfo);
    }

    public ClownResult deleteOperationLogInfo(Long id) {
        int retrunCode = operationDao.delOperationLogInfoById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }
}
