package com.hniu.entity;

import javax.persistence.*;

@Table(name = "tbl_reader_types")
public class ReaderTypes {
    /**
     * 读者类别id
     */
    @Id
    @Column(name = "reader_type_id")
    private Integer readerTypeId;

    /**
     * 类别名称
     */
    @Column(name = "reader_type_name")
    private String readerTypeName;

    /**
     * 借阅天数
     */
    @Column(name = "borrow_day")
    private Byte borrowDay;

    /**
     * 借阅册数
     */
    @Column(name = "borrow_number")
    private Byte borrowNumber;

    /**
     * 借阅次数
     */
    @Column(name = "continue_number")
    private Byte continueNumber;

    /**
     * 押金
     */
    private Float deposit;

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
     * 获取类别名称
     *
     * @return reader_type_name - 类别名称
     */
    public String getReaderTypeName() {
        return readerTypeName;
    }

    /**
     * 设置类别名称
     *
     * @param readerTypeName 类别名称
     */
    public void setReaderTypeName(String readerTypeName) {
        this.readerTypeName = readerTypeName;
    }

    /**
     * 获取借阅天数
     *
     * @return borrow_day - 借阅天数
     */
    public Byte getBorrowDay() {
        return borrowDay;
    }

    /**
     * 设置借阅天数
     *
     * @param borrowDay 借阅天数
     */
    public void setBorrowDay(Byte borrowDay) {
        this.borrowDay = borrowDay;
    }

    /**
     * 获取借阅册数
     *
     * @return borrow_number - 借阅册数
     */
    public Byte getBorrowNumber() {
        return borrowNumber;
    }

    /**
     * 设置借阅册数
     *
     * @param borrowNumber 借阅册数
     */
    public void setBorrowNumber(Byte borrowNumber) {
        this.borrowNumber = borrowNumber;
    }

    /**
     * 获取借阅次数
     *
     * @return continue_number - 借阅次数
     */
    public Byte getContinueNumber() {
        return continueNumber;
    }

    /**
     * 设置借阅次数
     *
     * @param continueNumber 借阅次数
     */
    public void setContinueNumber(Byte continueNumber) {
        this.continueNumber = continueNumber;
    }

    /**
     * 获取押金
     *
     * @return deposit - 押金
     */
    public Float getDeposit() {
        return deposit;
    }

    /**
     * 设置押金
     *
     * @param deposit 押金
     */
    public void setDeposit(Float deposit) {
        this.deposit = deposit;
    }
}