package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.User;

public interface UserMapper {
    public User findUserById(int id);

    public User findUserByName(String name);

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteById(User user);
}
