package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 * <p>
 * 退房信息
 */
public class ExitRoom {
    /**
     * 编号
     */
    private int id;
    /**
     * 开房时的订单
     */
    private RoomOrder order;
    /**
     * 退房日期
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date date;
    /**
     * 打扫客房的员工
     */
    private Employee dustman;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start StateType-------------");
        System.out.println("id:" + id);
        System.out.println("date:" + date);
        order.show();
        dustman.show();
        System.out.println("-------------end StateType-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomOrder getOrder() {
        return order;
    }

    public void setOrder(RoomOrder order) {
        this.order = order;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getDustman() {
        return dustman;
    }

    public void setDustman(Employee dustman) {
        this.dustman = dustman;
    }
}
