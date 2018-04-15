package org.resort.entity;

/**
 * @Author 郭文虎
 *
 * 仓库出库详细信息
 */
public class OutOrderInfo {
    /**
     * 编号
     */
    private int id;
    /**
     * 出库商品
     */
    private StorageGoods inventorygoods;
    /**
     * 出库订单
     */
    private StorageOrder storageorder;
    /**
     * 出库数量
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
        System.out.println("-------------start OutOrderInfo-------------");
        System.out.println("id:" + id);
        System.out.println("quantity:" + quantity);
        inventorygoods.show();
        unit.show();
        System.out.println("-------------end OutOrderInfo-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StorageGoods getInventorygoods() {
        return inventorygoods;
    }

    public void setInventorygoods(StorageGoods inventorygoods) {
        this.inventorygoods = inventorygoods;
    }

    public StorageOrder getStorageorder() {
        return storageorder;
    }

    public void setStorageorder(StorageOrder storageorder) {
        this.storageorder = storageorder;
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
