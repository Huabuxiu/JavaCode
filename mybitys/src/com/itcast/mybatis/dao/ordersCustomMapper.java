package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.orderscustom;

import java.util.List;

public interface ordersCustomMapper {

    //查询订单关联查询用户信息
    public List<orderscustom> findOrdersUser()throws Exception;

}
