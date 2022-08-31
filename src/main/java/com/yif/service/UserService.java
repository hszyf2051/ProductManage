package com.yif.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yif.entity.User;
import com.yif.vo.LoginUserVo;

import javax.transaction.SystemException;

/**
 * @author Yif
 */
public interface UserService extends IService<User> {
    LoginUserVo login(User user);

    boolean register(User user) throws SystemException;
}