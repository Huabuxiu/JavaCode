package com.itcast.mybatis.po;

import com.itcast.mybatis.po.User;

import java.util.Date;

/**
 * @program: mybitys
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-16 17:18
 **/
public class UserCustom extends User {

    public UserCustom()
    {
    }
    public UserCustom(String username, Date birthday, String sex, String address) {
        super(username, birthday, sex, address);
    }

    public UserCustom(Integer id, String username, java.sql.Date birthday, String sex, String address) {
        super(id, username, birthday, sex, address);
    }


}
