package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 * <p>
 * 销售记录
 */
public class Consume {
    /**
     * 编号
     */
    private int id;
    /**
     * 记录日期
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date date;
    /**
     * 销售类型
     */
    private ConsumeType type;
    /**
     * 记录者
     */
    private Employee employee;
    /**
     * 仓库订单
     */
    private StorageOrder storageorder;
    /**
     * 餐厅订单
     */
    private DiningHallOrder dininghallorder;
    /**
     * 工资领取记录
     */
    private SalaryRecord salaryrecord;
    /**
     * 客房订单
     */
    private RoomOrder roomorder;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start Consume-------------");
        System.out.println("id:" + id);
        System.out.println("date:" + date);
        type.show();
        employee.show();
        if (storageorder != null) {
            storageorder.show();
        }
        if (dininghallorder != null) {
            dininghallorder.show();
        }
        if (salaryrecord != null) {
            salaryrecord.show();
        }
        if (roomorder != null) {
            roomorder.show();
        }
        System.out.println("-------------end Consume-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ConsumeType getType() {
        return type;
    }

    public void setType(ConsumeType type) {
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public StorageOrder getStorageorder() {
        return storageorder;
    }

    public void setStorageorder(StorageOrder storageorder) {
        this.storageorder = storageorder;
    }

    public DiningHallOrder getDininghallorder() {
        return dininghallorder;
    }

    public void setDininghallorder(DiningHallOrder dininghallorder) {
        this.dininghallorder = dininghallorder;
    }

    public SalaryRecord getSalaryrecord() {
        return salaryrecord;
    }

    public void setSalaryrecord(SalaryRecord salaryrecord) {
        this.salaryrecord = salaryrecord;
    }

    public RoomOrder getRoomorder() {
        return roomorder;
    }

    public void setRoomorder(RoomOrder roomorder) {
        this.roomorder = roomorder;
    }
}
