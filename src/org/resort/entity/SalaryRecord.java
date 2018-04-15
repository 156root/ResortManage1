package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 *
 * 工资领取记录表
 */
public class SalaryRecord {
    /**
     * 编号
     */
    private int id;
    /**
     * 领取工资的员工
     */
    private Employee employee;
    /**
     * 领取时间
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date date;
    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start SalaryRecord-------------");
        System.out.println("id:" + id);
        System.out.println("date:" + date);
        employee.show();
        System.out.println("-------------end SalaryRecord-------------");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
