package org.resort.entity;

/**
 * @Author 郭文虎
 *
 * 开房订单详细
 */
public class RoomOrderInfo {
    /**
     * 编号
     */
    private int id;
    /**
     * 开的房间
     */
    private Room room;
    /**
     * 所属的订单
     */
    private RoomOrder order;
    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start RoomOrderInfo-------------");
        System.out.println("id:" + id);
        room.show();
        order.show();
        System.out.println("-------------end RoomOrderInfo-------------");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public RoomOrder getOrder() {
        return order;
    }

    public void setOrder(RoomOrder order) {
        this.order = order;
    }
}
