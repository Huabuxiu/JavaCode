package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.User;

public interface UserMapper {
    public User findUserById(int id);
}
