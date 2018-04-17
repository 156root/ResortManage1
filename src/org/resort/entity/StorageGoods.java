package org.resort.entity;

/**
 * @Author 郭文虎
 * 仓库商品
 */
public class StorageGoods {
    /**
     * 编号
     */
    private int id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品数量
     */
    private double quantity;
    /**
     * 单位
     */
    private Unit unit;
    /**
     * 商品类型
     */
    private GoodsType type;

    /**
     * 状态
     */
    private State state;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start StorageGoods-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("quantity:" + quantity);
        state.show();
        unit.show();
        type.show();
        System.out.println("-------------end StorageGoods-------------");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
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
}
