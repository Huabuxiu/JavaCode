package com.itcast.mybatis.po;

/**
 * @program: mybitys
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-16 17:17
 **/
public class UserQueryVo {
    private UserCustom userCustom;

    public UserQueryVo(UserCustom userCustom) {
        this.userCustom = userCustom;
    }

    public UserCustom getUserCustom() {
        return userCustom;
    }

    public void setUserCustom(UserCustom userCustom) {
        this.userCustom = userCustom;
    }
}
