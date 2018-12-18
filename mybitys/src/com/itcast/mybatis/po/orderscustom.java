package com.itcast.mybatis.po;

/**
 * @program: mybitys
 * @description:订单的扩展类
 * @author: Huabuxiu
 * @create: 2018-12-17 18:35
 **/
public class orderscustom extends orders {
    private String username;
    private String sex;
    private String address;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "orderscustom{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
