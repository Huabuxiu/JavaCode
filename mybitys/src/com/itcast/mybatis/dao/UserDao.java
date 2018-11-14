package com.itcast.mybatis.dao;


import com.itcast.mybatis.po.User;

public interface UserDao {
    public User findUserById(int id);

    public void insertUser(User user);

    public void deleteUser(User user);
}
