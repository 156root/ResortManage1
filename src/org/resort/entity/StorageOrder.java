package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 * 仓库订单
 */
public class StorageOrder {
    /**
     * 编号
     */
    private int id;
    /**
     * 下单时间
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date startdate;
    /**
     * 订单号
     */
    private String account;
    /**
     * 外部部门
     */
    private OutDepartment outdepartment;
    /**
     * 内部部门
     */
    private InDepartment indepartment;
    /**
     * 仓库管理员
     */
    private Employee receiver;
    /**
     * 订单结束时间
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date enddate;

    /**
     * 状态
     */
    private State state;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start StorageOrder-------------");
        System.out.println("id:" + id);
        System.out.println("startdate:" + startdate);
        System.out.println("enddate:" + enddate);
        if (state != null) {
            state.show();
        }
        if (receiver != null) {
            receiver.show();
        }
        if (outdepartment != null) {
            outdepartment.show();
        }
        if (indepartment != null) {
            indepartment.show();
        }
        System.out.println("-------------end StorageOrder-------------");
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public OutDepartment getOutdepartment() {
        return outdepartment;
    }

    public void setOutdepartment(OutDepartment outdepartment) {
        this.outdepartment = outdepartment;
    }

    public InDepartment getIndepartment() {
        return indepartment;
    }

    public void setIndepartment(InDepartment indepartment) {
        this.indepartment = indepartment;
    }

    public Employee getReceiver() {
        return receiver;
    }

    public void setReceiver(Employee receiver) {
        this.receiver = receiver;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}
