package com.lxw.lipicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = -3520600850779241732L;

    /**
     * 账号
     */

    private String userAccount;

    /**
     * 密码
     */

    private String userPassword;




}
