package org.resort.entity;

/**
 * @Author 郭文虎
 * 员工表
 */
public class Employee {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 员工角色
     */
    private Role role;
    /**
     * 员工所在部门
     */
    private InDepartment inDepartment;
    /**
     * 员工工资
     */
    private Double salary;
    /**
     * 性别
     */
    private String sex;
    /**
     * 身份证号
     */
    private String identitycard;
    /**
     * 电话
     */
    private String phone;
    /**
     * 员工账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态
     */
    private State state;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start Employee-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("salary:" + salary);
        System.out.println("sex:" + sex);
        System.out.println("identirycard:" + identitycard);
        System.out.println("phone:" + phone);
        System.out.println("account:" + account);
        System.out.println("password:" + password);
        state.show();
        role.show();
        inDepartment.show();
        System.out.println("-------------end Employee-------------");
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public InDepartment getInDepartment() {
        return inDepartment;
    }

    public void setInDepartment(InDepartment inDepartment) {
        this.inDepartment = inDepartment;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
