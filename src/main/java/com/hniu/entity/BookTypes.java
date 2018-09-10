package com.hniu.entity;

import javax.persistence.*;

@Table(name = "tbl_book_types")
public class BookTypes {
    /**
     * 类别id
     */
    @Id
    @Column(name = "book_type_id")
    private Integer bookTypeId;

    /**
     * 类别名称
     */
    @Column(name = "book_type_name")
    private String bookTypeName;

    /**
     * 父节点id
     */
    @Column(name = "father_node")
    private String fatherNode;

    /**
     * 分类号
     */
    @Column(name = "class_number")
    private String classNumber;

    /**
     * 获取类别id
     *
     * @return book_type_id - 类别id
     */
    public Integer getBookTypeId() {
        return bookTypeId;
    }

    /**
     * 设置类别id
     *
     * @param bookTypeId 类别id
     */
    public void setBookTypeId(Integer bookTypeId) {
        this.bookTypeId = bookTypeId;
    }

    /**
     * 获取类别名称
     *
     * @return book_type_name - 类别名称
     */
    public String getBookTypeName() {
        return bookTypeName;
    }

    /**
     * 设置类别名称
     *
     * @param bookTypeName 类别名称
     */
    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    /**
     * 获取父节点id
     *
     * @return father_node - 父节点id
     */
    public String getFatherNode() {
        return fatherNode;
    }

    /**
     * 设置父节点id
     *
     * @param fatherNode 父节点id
     */
    public void setFatherNode(String fatherNode) {
        this.fatherNode = fatherNode;
    }

    /**
     * 获取分类号
     *
     * @return class_number - 分类号
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * 设置分类号
     *
     * @param classNumber 分类号
     */
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
}