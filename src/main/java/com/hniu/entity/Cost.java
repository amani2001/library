package com.hniu.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tbl_costs")
public class Cost {
    /**
     * 缴费id
     */
    @Id
    @Column(name = "cost_id")
    private Integer costId;

    /**
     * 读者id
     */
    @Column(name = "reader_id")
    private Integer readerId;

    /**
     * 缴费类别
     */
    @Column(name = "cost_type")
    private Byte costType;

    /**
     * 金额
     */
    private Float numeric;

    /**
     * 支付方式
     */
    @Column(name = "pay_type")
    private Byte payType;

    /**
     * 缴费日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取缴费id
     *
     * @return cost_id - 缴费id
     */
    public Integer getCostId() {
        return costId;
    }

    /**
     * 设置缴费id
     *
     * @param costId 缴费id
     */
    public void setCostId(Integer costId) {
        this.costId = costId;
    }

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
     * 获取缴费类别
     *
     * @return cost_type - 缴费类别
     */
    public Byte getCostType() {
        return costType;
    }

    /**
     * 设置缴费类别
     *
     * @param costType 缴费类别
     */
    public void setCostType(Byte costType) {
        this.costType = costType;
    }

    /**
     * 获取金额
     *
     * @return numeric - 金额
     */
    public Float getNumeric() {
        return numeric;
    }

    /**
     * 设置金额
     *
     * @param numeric 金额
     */
    public void setNumeric(Float numeric) {
        this.numeric = numeric;
    }

    /**
     * 获取支付方式
     *
     * @return pay_type - 支付方式
     */
    public Byte getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * 获取缴费日期
     *
     * @return create_time - 缴费日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置缴费日期
     *
     * @param createTime 缴费日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}