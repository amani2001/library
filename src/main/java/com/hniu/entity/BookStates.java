package com.hniu.entity;

import javax.persistence.*;

@Table(name = "tbl_book_states")
public class BookStates {
    /**
     * 在馆id
     */
    @Id
    @Column(name = "book_state_id")
    private Integer bookStateId;

    /**
     * 图书id
     */
    @Column(name = "book_id")
    private Integer bookId;

    /**
     * 条形码
     */
    @Column(name = "bar_code")
    private String barCode;

    /**
     * 是否在馆
     */
    private Byte state;

    /**
     * 借阅次数
     */
    @Column(name = "borrow_number")
    private Short borrowNumber;

    /**
     * 获取在馆id
     *
     * @return book_state_id - 在馆id
     */
    public Integer getBookStateId() {
        return bookStateId;
    }

    /**
     * 设置在馆id
     *
     * @param bookStateId 在馆id
     */
    public void setBookStateId(Integer bookStateId) {
        this.bookStateId = bookStateId;
    }

    /**
     * 获取图书id
     *
     * @return book_id - 图书id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 设置图书id
     *
     * @param bookId 图书id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 获取条形码
     *
     * @return bar_code - 条形码
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 设置条形码
     *
     * @param barCode 条形码
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    /**
     * 获取是否在馆
     *
     * @return state - 是否在馆
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置是否在馆
     *
     * @param state 是否在馆
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取借阅次数
     *
     * @return borrow_number - 借阅次数
     */
    public Short getBorrowNumber() {
        return borrowNumber;
    }

    /**
     * 设置借阅次数
     *
     * @param borrowNumber 借阅次数
     */
    public void setBorrowNumber(Short borrowNumber) {
        this.borrowNumber = borrowNumber;
    }
}