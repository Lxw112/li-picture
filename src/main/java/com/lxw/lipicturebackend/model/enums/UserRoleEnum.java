package com.lxw.lipicturebackend.model.enums;

import cn.hutool.core.util.ObjectUtil;
import lombok.Getter;

/**
 * 用户角色枚举
 */
@Getter
public enum UserRoleEnum {

    USER("用户","user"),
    VIP("会员","vip"),
    ADMIN("管理员","admin");
    private final String text;

    private final String value;

    UserRoleEnum(String text ,String value){
        this.text = text;
        this.value = value;
    }

    /**
     * 根据值获取枚举
     * @param value
     * @return
     */
    public static UserRoleEnum getEnumByValue(String value){
        if (ObjectUtil.isEmpty(value)){
            return null;
        }
        for (UserRoleEnum userRoleEnum : UserRoleEnum.values()) {
            if (userRoleEnum.value.equals(value)){
                return userRoleEnum;
            }
        }
        return null;
    }
}
