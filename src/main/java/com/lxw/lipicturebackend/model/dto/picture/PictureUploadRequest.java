package com.lxw.lipicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PictureUploadRequest implements Serializable {

    private static final long serialVersionUID = -6065584664645332249L;
    /**
     * 图片 id （用于修改）
     */
    private Long id;

    /**
     * 文件地址
     */
    private String fileUrl;

    /**
     * 图片名称
     */
    private String picName;

    /**
     * 分类
     */
    private String category;

    /**
     * 标签
     */
    private List<String> tags;

    /**
     * 空间 id
     */
    private Long spaceId;

}
