package com.hm.manage.operation.service;

import com.hm.common.entity.ClownResult;
import com.hm.manage.operation.model.OperationBo;
import com.hm.manage.operation.model.OperationLogBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IOperationService {

    /**
     *@描述 新增、修改功能操作表数据信息
     *@参数 operationBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addOperationInfo(OperationBo operationBo);

    /**
     *@描述 获取功能操作表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getOperationInfo(Long id);

    /**
     *@描述 删除功能操作表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteOperationInfo(Long id);

    /**
     *@描述 新增、修改操作日志表数据信息
     *@参数 operationLogBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult addOperationLogInfo(OperationLogBo operationLogBo);

    /**
     *@描述 获取操作日志表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult getOperationLogInfo(Long id);

    /**
     *@描述 删除操作日志表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public ClownResult deleteOperationLogInfo(Long id);
}
