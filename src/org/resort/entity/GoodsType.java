package org.resort.entity;

/**
 * @Author 郭文虎
 * 商品类型
 */
public class GoodsType {
    /**
     * 编号
     */
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String descriptor;
    /**
     * 该商品类型所属的部门
     */
    private InDepartment inDepartment;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start GoodsType-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("descriptor:" + descriptor);
        inDepartment.show();
        System.out.println("-------------end GoodsType-------------");
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

    public InDepartment getInDepartment() {
        return inDepartment;
    }

    public void setInDepartment(InDepartment inDepartment) {
        this.inDepartment = inDepartment;
    }
}
