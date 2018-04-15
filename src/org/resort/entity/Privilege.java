package org.resort.entity;

/**
 * @Author 郭文虎
 * 权限
 */
public class Privilege {
    /**
     * 编号
     */
    private int id;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 点击之后跳转路径
     */
    private String href;
    /**
     * 父权限显示时的图标类样式
     */
    private String icon;
    /**
     * 父权限
     */
    private Privilege parent;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start Privilege-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("href:"+href);
        System.out.println("icon:" + icon);
        if (parent != null) {
            System.out.println("-------------start Privilege~parent-------------");
            parent.show();
            System.out.println("-------------end Privilege~parent-------------");
        }
        System.out.println("-------------end Privilege-------------");
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

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Privilege getParent() {
        return parent;
    }

    public void setParent(Privilege parent) {
        this.parent = parent;
    }
}
