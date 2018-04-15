package org.resort.entity;

/**
 * @Author 郭文虎
 * 外部部门
 */
public class OutDepartment {
    /**
     * 编号
     */
    private int id;
    /**
     * 外部部门名称
     */
    private String storename;
    /**
     * 联系人电话
     */
    private String phone;
    /**
     * 联系人姓名
     */
    private String contactperson;
    /**
     * 外部部门地址
     */
    private String address;

    /**
     * 显示所有数据，用于开发时调试使用
     */
    public void show() {
        System.out.println("-------------start OutDepartment-------------");
        System.out.println("id:" + id);
        System.out.println("storename:" + storename);
        System.out.println("phone:" + phone);
        System.out.println("contactperson:" + contactperson);
        System.out.println("address:" + address);
        System.out.println("-------------end OutDepartment-------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
