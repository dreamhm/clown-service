package com.hm.manage.file.service;

import com.hm.common.entity.ClownResult;
import com.hm.manage.file.model.FileBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IFileService {
    /**
     *@描述 新增、修改文件信息
     *@参数 fileBo
     *@返回值 clownResult
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public ClownResult addFileInfo(FileBo fileBo);

    /**
     *@描述 获取文件信息
     *@参数 id
     *@返回值 file
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public ClownResult getFileInfo(Long id);

    /**
     *@描述 删除文件信息
     *@参数 id
     *@返回值 file
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public ClownResult deleteFileInfo(Long id);
}
