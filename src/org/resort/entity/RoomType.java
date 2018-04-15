package org.resort.entity;

/**
 * @Author 郭文虎
 * 房间类型
 */
public class RoomType {
    /**
     * 编号
     */
    private int id;
    /**
     * 房间类型名称
     */
    private String name;
    /**
     * 该类型房间当前所使用的数量
     */
    private int currentamount;
    /**
     * 房间类型描述
     */
    private String descriptor;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start RoomType-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("currentamount:" + currentamount);
        System.out.println("descriptor:" + descriptor);
        System.out.println("-------------end RoomType-------------");
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

    public int getCurrentamount() {
        return currentamount;
    }

    public void setCurrentamount(int currentamount) {
        this.currentamount = currentamount;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}
