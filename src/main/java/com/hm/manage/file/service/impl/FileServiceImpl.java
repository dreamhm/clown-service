package com.hm.manage.file.service.impl;

import com.hm.common.entity.ClownResult;
import com.hm.common.utils.ClownResultUtil;
import com.hm.common.utils.SnowFlake;
import com.hm.manage.file.dao.IFileDao;
import com.hm.manage.file.model.FileBo;
import com.hm.manage.file.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Service("fileService")
public class FileServiceImpl implements IFileService {

    @Autowired
    private IFileDao fileDao;

    public ClownResult addFileInfo(FileBo fileBo) {
        int retrunCode = 0;
        if(fileBo.getId() == null || fileBo.getId().equals("")){
            fileBo.setId(SnowFlake.genId());
            retrunCode = fileDao.insertFileInfo(fileBo);
        }else{
            retrunCode = fileDao.updFileInfo(fileBo);
        }
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }

    public ClownResult getFileInfo(Long id) {
        FileBo fileInfo = fileDao.selectFileById(id);
        return ClownResultUtil.getClowenResultByData(fileInfo);
    }

    public ClownResult deleteFileInfo(Long id) {
        int retrunCode = fileDao.deleteFileById(id);
        return ClownResultUtil.equalsNumberIsZero(retrunCode);
    }
}
