package org.resort.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 郭文虎
 * 角色
 */
public class Role {
    /**
     * 编号
     */
    private int id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 描述
     */
    private String descriptor;
    /**
     * Role所包含的权限
     */
    private List<RolePrivilege> privilegesList = new ArrayList<RolePrivilege>();

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start Role-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("descriptor:" + descriptor);
        System.out.println("-------------end Role-------------");
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
