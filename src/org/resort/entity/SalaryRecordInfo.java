package org.resort.entity;

/**
 * @Author 郭文虎
 *
 * 工资领取记录详细
 */
public class SalaryRecordInfo {
    /**
     * 编号
     */
    private int id;
    /**
     * 工资领取记录
     */
    private SalaryRecord salaryrecord;
    /**
     * 描述
     */
    private String descriptor;
    /**
     * 领取金额
     */
    private double price;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start SalaryRecordInfo-------------");
        System.out.println("id:" + id);
        System.out.println("descriptor:" + descriptor);
        System.out.println("price:"+price);
        salaryrecord.show();
        System.out.println("-------------end SalaryRecordInfo-------------");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SalaryRecord getSalaryrecord() {
        return salaryrecord;
    }

    public void setSalaryrecord(SalaryRecord salaryrecord) {
        this.salaryrecord = salaryrecord;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
