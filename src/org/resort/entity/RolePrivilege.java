package org.resort.entity;

/**
 * @Author 郭文虎
 * 角色权限关联
 */
public class RolePrivilege {
    /**
     * 编号
     */
    private int id;
    /**
     * 角色
     */
    private Role role;
    /**
     * 权限
     */
    private Privilege privilege;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start RolePrivilege-------------");
        System.out.println("id:" + id);
        role.show();
        privilege.show();
        System.out.println("-------------end RolePrivilege-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Privilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Privilege privilege) {
        this.privilege = privilege;
    }
}
