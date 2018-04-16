package org.resort.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @Author 郭文虎
 * 会员充值
 */
public class MemberRecharge {
    /**
     * 编号
     */
    private int id;
    /**
     * 冲值的会员
     */
    private Member member;
    /**
     * 充值金额
     */
    private double recharge;
    /**
     * 充值日期
     */
    @JSONField(format = "YYYY/MM/dd HH:mm:ss")
    private Date date;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start MemberRecharge-------------");
        System.out.println("id:" + id);
        System.out.println("recharge:" + recharge);
        System.out.println("date:" + date);
        member.show();
        System.out.println("-------------end MemberRecharge-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public double getRecharge() {
        return recharge;
    }

    public void setRecharge(double recharge) {
        this.recharge = recharge;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
