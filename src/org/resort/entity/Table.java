package org.resort.entity;

/**
 * @Author 郭文虎
 * 餐桌
 */
public class Table {
    private int id;
    private String name;
    private TableType type;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start Table-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        type.show();
        System.out.println("-------------end Table-------------");
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

    public TableType getType() {
        return type;
    }

    public void setType(TableType type) {
        this.type = type;
    }
}
