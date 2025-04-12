package com.lxw.lipicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lxw.lipicturebackend.model.dto.user.UserQueryRequest;
import com.lxw.lipicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lxw.lipicturebackend.model.vo.LoginUserVO;
import com.lxw.lipicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author Administrator
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-04-08 21:05:12
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return  新用户id
     */
    long userRegister(String userAccount, String userPassword,String checkPassword);


    /**
     * 用户登录
     * @param userAccount
     * @param userPassword
     * @param request
     * @return 脱敏后的用户信息
     */
    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 获取当前登录用户
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    /**
     * 获取加密后的密码
     * @param userPassword
     * @return
     */
    String getEncryptPassword(String userPassword);


    /**
     * 用戶注銷
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获得脱敏后的用户信息列表
     * @param userList
     * @return 脱敏后的用户列表
     */
    List<UserVO> getUserVOList(List<User> userList);

    /**
     * 获取查询条件
     * @param userQueryRequest
     * @return
     */
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    /**
     * 是否为管理员
     * @param user
     * @return
     */
    boolean isAdmin(User user);

}
