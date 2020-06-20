package com.hm.manage.pageElement.controller;

import com.hm.common.entity.ClownResult;
import com.hm.manage.pageElement.model.PageElementBo;
import com.hm.manage.pageElement.service.IPageElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@RestController
@RequestMapping("/clPageElement")
public class PageElementController {

    @Autowired
    private IPageElementService pageElementService;

    @PostMapping("/pageElementInfo/addPageElementInfo")
    public ClownResult addPageElementInfo(@RequestBody PageElementBo pageElementBo){
        return pageElementService.addPageElementInfo(pageElementBo);
    }

    @GetMapping("/pageElementInfo/{id}")
    public ClownResult getPageElementInfo(@PathVariable("id") Long id){
        return pageElementService.getPageElementInfo(id);
    }

    @DeleteMapping("/pageElementInfo/{id}")
    public ClownResult deletePageElementInfo(@PathVariable("id") Long id){
        return pageElementService.deletePageElementInfo(id);
    }
}
