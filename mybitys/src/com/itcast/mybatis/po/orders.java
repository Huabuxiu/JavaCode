package com.itcast.mybatis.po;

import java.util.Date;
import java.util.List;

/**
 * @program: mybitys
 * @description:
 * @author: Huabuxiu
 * @create: 2018-12-17 18:32
 **/
public class orders {
    private int id;

    private int user_id;

    private String number;

    private Date createtime;

    private String note;

    private List<OrderDetail> orderDetails;

    private User user;

    public com.itcast.mybatis.po.User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "orders{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", orderDetails=" + orderDetails +
                ", user=" + user +
                '}';
    }
}
