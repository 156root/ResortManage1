package org.resort.entity;

/**
 * @Author 郭文虎
 * 会员等级表
 */
public class MemberLevel {
    /**
     * 编号
     */
    private int id;
    /**
     * 会员等级名称
     */
    private String name;
    /**
     * 会员等级价格
     */
    private double price;
    /**
     * 会员等级折扣率
     */
    private double discount;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start MemberLevel-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("price:" + price);
        System.out.println("discount:" + discount);
        System.out.println("-------------end MemberLevel-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
