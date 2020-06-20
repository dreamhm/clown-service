package com.hm.manage.operation.dao;

import com.hm.manage.operation.model.OperationBo;
import com.hm.manage.operation.model.OperationLogBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IOperationDao {

    /**
     *@描述 新增功能操作表数据信息
     *@参数 operationBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertOperationInfo(OperationBo operationBo);

    /**
     *@描述 修改功能操作表数据信息
     *@参数 operationBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateOperationInfo(OperationBo operationBo);

    /**
     *@描述 获取功能操作表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public OperationBo selectOperationInfoById(Long id);

    /**
     *@描述 删除功能操作表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delOperationInfoById(Long id);

    /**
     *@描述 新增操作日志表数据信息
     *@参数 operationLogBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int insertOperationLogInfo(OperationLogBo operationLogBo);

    /**
     *@描述 修改操作日志表数据信息
     *@参数 operationLogBo
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int updateOperationLogInfo(OperationLogBo operationLogBo);

    /**
     *@描述 查询操作日志表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public OperationLogBo selectOperationLogInfoById(Long id);

    /**
     *@描述 删除操作日志表数据信息
     *@参数 id
     *@返回值
     *@创建人 haomiao
     *@创建时间 2020/2/17
     */
    public int delOperationLogInfoById(Long id);
}
