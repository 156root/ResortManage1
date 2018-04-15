package org.resort.entity;

/**
 * @Authro 郭文虎
 * <p>
 * 餐厅订单详细
 */
public class DiningHallOrderInfo {
    /**
     * 编号
     */
    private int id;
    /**
     * 所属的餐厅订单
     */
    private DiningHallOrder order;
    /**
     * 所出售的商品
     */
    private DiningHallGoods goods;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start DiningHallOrderInfo-------------");
        System.out.println("id:" + id);
        order.show();
        goods.show();
        System.out.println("-------------end DiningHallOrderInfo-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DiningHallOrder getOrder() {
        return order;
    }

    public void setOrder(DiningHallOrder order) {
        this.order = order;
    }

    public DiningHallGoods getGoods() {
        return goods;
    }

    public void setGoods(DiningHallGoods goods) {
        this.goods = goods;
    }
}
