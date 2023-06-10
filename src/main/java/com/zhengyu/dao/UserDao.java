package com.zhengyu.dao;

import com.zhengyu.entity.User;


public interface UserDao {
    User findByUserName(String username);

    void save(User user);
}
