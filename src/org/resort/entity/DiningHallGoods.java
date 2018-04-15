package org.resort.entity;

/**
 * @Author 郭文虎
 * 餐厅商品
 */
public class DiningHallGoods {
    /**
     * 编号
     */
    private int id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private double price;
    /**
     * 单位
     */
    private Unit unit;
    /**
     * 商品类型
     */
    private GoodsType type;
    /**
     * 商品状态
     */
    private State state;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start DiningHallGoods-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("price:" + price);
        unit.show();
        type.show();
        state.show();
        System.out.println("-------------end DiningHallGoods-------------");
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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public GoodsType getType() {
        return type;
    }

    public void setType(GoodsType type) {
        this.type = type;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
