package com.zhengyu.service;

import com.zhengyu.entity.User;

public interface UserService {
    void register(User user);

    //用户登录
    User login(String username, String password);
}
