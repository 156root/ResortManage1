package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 * 会员表
 */
public class Member {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String identitycard;
    /**
     * 等级
     */
    private MemberLevel memberlevel;
    /**
     * 会员卡号
     */
    private String account;
    /**
     * 余额
     */
    private double balance;
    /**
     * 状态
     */
    private State state;
    /**
     * 开卡日期
     */
    @JSONField(format = "YYYY/MM/dd: HH:mm:ss")
    private Date startdate;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 密码
     */
    private String password;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start Member-------------");
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("identirycard:" + identitycard);
        System.out.println("account:" + account);
        System.out.println("balance:" + balance);
        System.out.println("startdate:" + startdate);
        System.out.println("phone:" + phone);
        System.out.println("password:"+password);
        memberlevel.show();
        state.show();
        System.out.println("-------------end Member-------------");
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

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public MemberLevel getMemberlevel() {
        return memberlevel;
    }

    public void setMemberlevel(MemberLevel memberlevel) {
        this.memberlevel = memberlevel;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
