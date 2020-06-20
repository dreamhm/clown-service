package com.hm.common.utils;

import com.hm.common.entity.ClownConstant;
import com.hm.common.entity.ClownResult;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public class ClownResultUtil {

    /**
     *@描述 查询单条数据
     */
    /**
     *@描述 差询单条数据
     *@参数 数据信息
     *@返回值 result
     */
    public static ClownResult getClowenResultByData(Object data){
        ClownResult result = new ClownResult();
        result.setCode(ClownConstant.OK);
        result.setMsg(ClownConstant.OK_MSG);
        result.setResult(data);
        return result;
    }

    /**
     *@描述 新增、修改、删除 操作成功判断
     *@参数 影响行数
     *@返回值 ClownResult
     */
    public static ClownResult equalsNumberIsZero(int returnCode){
        ClownResult result = new ClownResult();
        if(returnCode > 0){
            result.setCode(ClownConstant.OK);
            result.setMsg(ClownConstant.OK_MSG);
        }else {
            result.setCode(ClownConstant.ERROR);
            result.setMsg(ClownConstant.ERROR_MSG);
        }
        return result;
    }
}
