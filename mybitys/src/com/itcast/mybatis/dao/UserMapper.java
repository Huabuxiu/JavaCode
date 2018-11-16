package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.User;
import com.itcast.mybatis.po.UserCustom;
import com.itcast.mybatis.po.UserQueryVo;

import java.util.List;

public interface UserMapper {
    public User findUserById(int id);

    public User findUserByName(String name);

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteById(User user);

    //查询综合信息
    public List<UserCustom> findUserList(UserQueryVo userQueryVo);

    //查询综合信息总数
    public  int findUserCount(UserQueryVo userQueryVo);
}
