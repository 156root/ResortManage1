package org.resort.entity;

/**
 * @Author 郭文虎
 * 状态
 */
public class State {
    /**
     * 编号
     */
    private int id;
    /**
     * 状态名称
     */
    private String name;
    /**
     * 描述
     */
    private String descriptor;
    /**
     * 状态类型
     */
    private StateType type;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start State-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("descriptor:" + descriptor);
        type.show();
        System.out.println("-------------end State-------------");
    }

    public StateType getType() {
        return type;
    }

    public void setType(StateType type) {
        this.type = type;
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

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }
}
