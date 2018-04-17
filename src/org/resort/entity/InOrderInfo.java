package org.resort.entity;

/**
 * @Author 郭文虎
 *
 * 仓库入库详细
 */
public class InOrderInfo {
    /**
     * 编号
     */
    private int id;
    /**
     * 所属的仓库订单编号
     */
    private StorageOrder storageorder;
    /**
     * 购买的商品名称
     */
    private String goodsname;
    /**
     * 价格
     */
    private double price;
    /**
     * 数量
     */
    private double quantity;
    /**
     * 单位
     */
    private Unit unit;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start InOrderInfo-------------");
        System.out.println("id:" + id);
        System.out.println("goodsname:" + goodsname);
        System.out.println("price:" + price);
        System.out.println("quantity:"+quantity);
        unit.show();
        storageorder.show();
        System.out.println("-------------end InOrderInfo-------------");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StorageOrder getStorageorder() {
        return storageorder;
    }

    public void setStorageorder(StorageOrder storageorder) {
        this.storageorder = storageorder;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
}
