package org.resort.entity;

/**
 * @Author 郭文虎
 * 客房
 */
public class Room {
    /**
     * 编号
     */
    private int id;
    /**
     * 客房名称
     */
    private String name;
    /**
     * 客户类型
     */
    private RoomType type;

    /**
     * 状态
     */
    private State state;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start Room-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        state.show();
        type.show();
        System.out.println("-------------end Room-------------");
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

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}
