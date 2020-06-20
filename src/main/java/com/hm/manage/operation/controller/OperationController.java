package com.hm.manage.operation.controller;

import com.hm.common.entity.ClownResult;
import com.hm.manage.operation.model.OperationBo;
import com.hm.manage.operation.model.OperationLogBo;
import com.hm.manage.operation.service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clOperation")
public class OperationController {

    @Autowired
    private IOperationService operationService;

    /* table - [Operation] */
    @PostMapping("/operation/addOperationInfo")
    private ClownResult addOperationInfo(@RequestBody OperationBo operationBo){
        return operationService.addOperationInfo(operationBo);
    }

    @GetMapping("/operation/{id}")
    public ClownResult getOperationInfo(@PathVariable("id") Long id){
        return operationService.getOperationInfo(id);
    }

    @DeleteMapping("/operation/{id}")
    public ClownResult deleteOperationInfo(@PathVariable("id") Long id){
        return operationService.deleteOperationInfo(id);
    }

    /* table - [OperationLog] */
    @PostMapping("/operationLog/addOperationLogInfo")
    public ClownResult addOperationLogInfo(@RequestBody OperationLogBo operationLogBo){
        return operationService.addOperationLogInfo(operationLogBo);
    }

    @GetMapping("/operationLog/{id}")
    public ClownResult getOperationLogInfo(@PathVariable("id") Long id){
        return operationService.getOperationLogInfo(id);
    }

    @DeleteMapping("/operationLog/{id}")
    public ClownResult deleteOperationLogInfo(@PathVariable("id") Long id){
        return operationService.deleteOperationLogInfo(id);
    }
}
