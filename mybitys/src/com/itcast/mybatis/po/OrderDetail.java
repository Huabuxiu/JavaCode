package com.itcast.mybatis.po;

import java.util.PrimitiveIterator;

/**
 * @program: mybitys
 * @description:
 * @author: Huabuxiu
 * @create: 2018-12-18 18:52
 **/
public class OrderDetail {
    private int id;

    private int orders_id;

    private int items_id;

    private int items_num;

    private items items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public int getItems_num() {
        return items_num;
    }

    public void setItems_num(int items_num) {
        this.items_num = items_num;
    }
}
