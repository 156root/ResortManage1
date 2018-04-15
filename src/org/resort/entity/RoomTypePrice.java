package org.resort.entity;

/**
 * @Authro 郭文虎
 * <p>
 * 房间类型价格
 */
public class RoomTypePrice {
    /**
     * 编号
     */
    private int id;
    /**
     * 每住多少天
     */
    private double day;
    /**
     * 的价格
     */
    private double price;

    /**
     * 客房类型
     */
    private RoomType type;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start RoomTypePrice-------------");
        System.out.println("id:" + id);
        System.out.println("day:" + day);
        System.out.println("price:" + price);
        type.show();
        System.out.println("-------------end RoomTypePrice-------------");
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDay() {
        return day;
    }

    public void setDay(double day) {
        this.day = day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
