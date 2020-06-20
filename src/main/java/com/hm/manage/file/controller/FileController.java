package com.hm.manage.file.controller;

import com.hm.common.entity.ClownResult;
import com.hm.manage.file.model.FileBo;
import com.hm.manage.file.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clFile")
public class FileController {

    @Autowired
    private IFileService fileService;

    @PostMapping("/file/addFileInfo")
    public ClownResult addFileInfo(@RequestBody FileBo fileBo){
        return fileService.addFileInfo(fileBo);
    }

    @GetMapping("/file/{id}")
    public ClownResult getFileInfo(@PathVariable("id") Long id){
        return fileService.getFileInfo(id);
    }

    @DeleteMapping("/file/{id}")
    public ClownResult deleteFileInfo(@PathVariable("id") Long id){
        return fileService.deleteFileInfo(id);
    }

}
