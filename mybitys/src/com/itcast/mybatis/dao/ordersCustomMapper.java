package com.itcast.mybatis.dao;

import com.itcast.mybatis.po.User;
import com.itcast.mybatis.po.orders;
import com.itcast.mybatis.po.orderscustom;

import java.util.List;

public interface ordersCustomMapper {

    //查询订单关联查询用户信息
    public List<orderscustom> findOrdersUser()throws Exception;

    //查询用户及订单明细
    public List<orders>findOrdersAndOrderDetailResultMap()throws Exception;

    //查询用户和用户所购买的商品

    public List<User>findUserAndItemsResultMap()throws Exception;

    //查询订单关联用户延迟加载方式
    public List<orders> findOrdersUserLazyLoding()throws Exception;
}
