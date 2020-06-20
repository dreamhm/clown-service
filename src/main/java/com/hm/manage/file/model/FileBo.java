package com.hm.manage.file.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @创建人 【郝苗】
 * @创建时间
 * @描述:
 */
@Setter
@Getter
public class FileBo implements Serializable {
    private Long id;//文件表
    private String fileName;// 文件名称
    private String filePath;// 文体路径
}
