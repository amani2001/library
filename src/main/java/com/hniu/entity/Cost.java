package com.hniu.entity;

import java.util.Date;

public class Cost {
    private Integer costId;

    private Integer readerId;

    private Byte costType;

    private Float numeric;

    private Byte payType;

    private Date createTime;

    public Integer getCostId() {
        return costId;
    }

    public void setCostId(Integer costId) {
        this.costId = costId;
    }

    public Integer getReaderId() {
        return readerId;
    }

    public void setReaderId(Integer readerId) {
        this.readerId = readerId;
    }

    public Byte getCostType() {
        return costType;
    }

    public void setCostType(Byte costType) {
        this.costType = costType;
    }

    public Float getNumeric() {
        return numeric;
    }

    public void setNumeric(Float numeric) {
        this.numeric = numeric;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}