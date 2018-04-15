package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 * <p>
 * 餐厅订单
 */
public class DiningHallOrder {
    /**
     * 编号
     */
    private int id;
    /**
     * 下单时间
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date date;
    /**
     * 下单餐桌
     */
    private Table table;
    /**
     * 服务员
     */
    private Employee employee;
    /**
     * 结账会员
     */
    private Member member;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start DiningHallOrder-------------");
        System.out.println("id:" + id);
        System.out.println("date:" + date);
        table.show();
        employee.show();
        member.show();
        System.out.println("-------------end DiningHallOrder-------------");
    }
}
