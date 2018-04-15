package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 *
 * 客房续费信息
 */
public class AppendRoom {
    /**
     * 编号
     */
    private int id;
    /**
     * 开房时的订单
     */
    private RoomOrder order;
    /**
     * 续费到什么时间
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date date;
    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start AppendRoom-------------");
        System.out.println("id:" + id);
        System.out.println("date:" + date);
        order.show();
        System.out.println("-------------end AppendRoom-------------");
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
}
