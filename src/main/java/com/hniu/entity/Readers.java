package com.hniu.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tbl_readers")
public class Readers {
    /**
     * 读者id
     */
    @Id
    @Column(name = "reader_id")
    private Integer readerId;

    /**
     * 读者类别id
     */
    @Column(name = "reader_type_id")
    private Integer readerTypeId;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 读者姓名
     */
    @Column(name = "reader_name")
    private String readerName;

    private String password;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 身份证号
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 性别
     */
    private Byte sex;

    /**
     * 办证日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 到期日期
     */
    @Column(name = "expiration_time")
    private Date expirationTime;

    /**
     * 证书状态
     */
    private Byte state;

    /**
     * 逾期次数
     */
    @Column(name = "overdue_number")
    private Byte overdueNumber;

    /**
     * 读者编号
     */
    @Column(name = "reader_code")
    private String readerCode;

    @Column(name = "session_key")
    private String sessionKey;

    /**
     * 获取读者id
     *
     * @return reader_id - 读者id
     */
    public Integer getReaderId() {
        return readerId;
    }

    /**
     * 设置读者id
     *
     * @param readerId 读者id
     */
    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    /**
     * 获取读者类别id
     *
     * @return reader_type_id - 读者类别id
     */
    public Integer getReaderTypeId() {
        return readerTypeId;
    }

    /**
     * 设置读者类别id
     *
     * @param readerTypeId 读者类别id
     */
    public void setReaderTypeId(Integer readerTypeId) {
        this.readerTypeId = readerTypeId;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取读者姓名
     *
     * @return reader_name - 读者姓名
     */
    public String getReaderName() {
        return readerName;
    }

    /**
     * 设置读者姓名
     *
     * @param readerName 读者姓名
     */
    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取微信号
     *
     * @return wechat - 微信号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信号
     *
     * @param wechat 微信号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取身份证号
     *
     * @return id_card - 身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证号
     *
     * @param idCard 身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取办证日期
     *
     * @return create_time - 办证日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置办证日期
     *
     * @param createTime 办证日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取到期日期
     *
     * @return expiration_time - 到期日期
     */
    public Date getExpirationTime() {
        return expirationTime;
    }

    /**
     * 设置到期日期
     *
     * @param expirationTime 到期日期
     */
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * 获取证书状态
     *
     * @return state - 证书状态
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置证书状态
     *
     * @param state 证书状态
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取逾期次数
     *
     * @return overdue_number - 逾期次数
     */
    public Byte getOverdueNumber() {
        return overdueNumber;
    }

    /**
     * 设置逾期次数
     *
     * @param overdueNumber 逾期次数
     */
    public void setOverdueNumber(Byte overdueNumber) {
        this.overdueNumber = overdueNumber;
    }

    /**
     * 获取读者编号
     *
     * @return reader_code - 读者编号
     */
    public String getReaderCode() {
        return readerCode;
    }

    /**
     * 设置读者编号
     *
     * @param readerCode 读者编号
     */
    public void setReaderCode(String readerCode) {
        this.readerCode = readerCode;
    }

    /**
     * @return session_key
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * @param sessionKey
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }
}