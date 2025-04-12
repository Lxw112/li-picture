package com.lxw.lipicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureUploadRequest implements Serializable {

    private static final long serialVersionUID = -6065584664645332249L;
    /**
     * 图片 id （用于修改）
     */
    private Long id;



}
