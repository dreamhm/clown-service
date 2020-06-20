package com.hm.manage.file.dao;

import com.hm.manage.file.model.FileBo;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
public interface IFileDao {

    /**
     *@描述 新增文件信息
     *@参数 fileBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public int insertFileInfo(FileBo fileBo);

    /**
     *@描述 修改文件信息
     *@参数 fileBo
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public int updFileInfo(FileBo fileBo);

    /**
     *@描述 查询文件信息
     *@参数 id
     *@返回值 文件信息
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public FileBo selectFileById(Long id);

    /**
     *@描述 删除文件信息
     *@参数 id
     *@返回值 影响行
     *@创建人 haomiao
     *@创建时间 2020/2/16
     */
    public int deleteFileById(Long id);
}
