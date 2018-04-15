package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 * <p>
 * 客房订单
 */
public class RoomOrder {
    /**
     * 编号
     */
    private int id;
    /**
     * 住宿开始时间
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date startdate;
    /**
     * 住宿结束时间
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date enddate;
    /**
     * 开房的会员
     */
    private Member member;
    /**
     * 受理的员工
     */
    private Employee employee;
    /**
     * 订单状态
     */
    private State state;
    /**
     * 住宿天数
     */
    private double day;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start RoomOrder-------------");
        System.out.println("id:" + id);
        System.out.println("startdate:" + startdate);
        System.out.println("enddate:" + enddate);
        System.out.println("day:" + day);
        member.show();
        employee.show();
        state.show();
        System.out.println("-------------end RoomOrder-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }
}
