package com.hniu.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tbl_borrows")
public class Borrows {
    /**
     * 借阅id
     */
    @Id
    @Column(name = "borrow_id")
    private Integer borrowId;

    /**
     * 借书日期
     */
    @Column(name = "borrow_time")
    private Date borrowTime;

    /**
     * 还书日期
     */
    @Column(name = "repay_time")
    private Date repayTime;

    /**
     * 是否续借
     */
    private Boolean renew;

    /**
     * 是否逾期
     */
    private Boolean overdue;

    /**
     * 读者id
     */
    @Column(name = "reader_id")
    private Integer readerId;

    /**
     * 在馆id
     */
    @Column(name = "book_state_id")
    private Integer bookStateId;

    /**
     * 罚款金额
     */
    private Float fine;

    /**
     * 获取借阅id
     *
     * @return borrow_id - 借阅id
     */
    public Integer getBorrowId() {
        return borrowId;
    }

    /**
     * 设置借阅id
     *
     * @param borrowId 借阅id
     */
    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * 获取借书日期
     *
     * @return borrow_time - 借书日期
     */
    public Date getBorrowTime() {
        return borrowTime;
    }

    /**
     * 设置借书日期
     *
     * @param borrowTime 借书日期
     */
    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = borrowTime;
    }

    /**
     * 获取还书日期
     *
     * @return repay_time - 还书日期
     */
    public Date getRepayTime() {
        return repayTime;
    }

    /**
     * 设置还书日期
     *
     * @param repayTime 还书日期
     */
    public void setRepayTime(Date repayTime) {
        this.repayTime = repayTime;
    }

    /**
     * 获取是否续借
     *
     * @return renew - 是否续借
     */
    public Boolean getRenew() {
        return renew;
    }

    /**
     * 设置是否续借
     *
     * @param renew 是否续借
     */
    public void setRenew(Boolean renew) {
        this.renew = renew;
    }

    /**
     * 获取是否逾期
     *
     * @return overdue - 是否逾期
     */
    public Boolean getOverdue() {
        return overdue;
    }

    /**
     * 设置是否逾期
     *
     * @param overdue 是否逾期
     */
    public void setOverdue(Boolean overdue) {
        this.overdue = overdue;
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
     * 获取罚款金额
     *
     * @return fine - 罚款金额
     */
    public Float getFine() {
        return fine;
    }

    /**
     * 设置罚款金额
     *
     * @param fine 罚款金额
     */
    public void setFine(Float fine) {
        this.fine = fine;
    }
}