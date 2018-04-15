package org.resort.entity;

/**
 * @Author 郭文虎
 * 餐桌类型
 */
public class TableType {
    /**
     * 编号
     */
    private int id;
    /**
     * 餐桌类型名称
     */
    private String name;
    /**
     * 描述
     */
    private String descriptor;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start TableType-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("descriptor:" + descriptor);
        System.out.println("-------------end TableType-------------");
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
