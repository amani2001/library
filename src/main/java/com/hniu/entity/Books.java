package com.hniu.entity;

import javax.persistence.*;

@Table(name = "tbl_books")
public class Books {
    /**
     * 图书id
     */
    @Id
    @Column(name = "book_id")
    private Integer bookId;

    /**
     * 类别id
     */
    @Column(name = "book_type_id")
    private Integer bookTypeId;

    /**
     * 书名
     */
    @Column(name = "book_name")
    private String bookName;

    /**
     * 封面图片
     */
    @Column(name = "img_path")
    private String imgPath;

    /**
     * isbn
     */
    private String isbn;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String press;

    /**
     * 价格
     */
    private String price;

    /**
     * 出版日期
     */
    @Column(name = "publication_time")
    private String publicationTime;

    /**
     * 页数
     */
    @Column(name = "page_number")
    private Integer pageNumber;

    /**
     * 入馆册数
     */
    private Short number;

    /**
     * 入库日期
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 分类号
     */
    @Column(name = "class_number")
    private String classNumber;

    /**
     * 图书简介
     */
    private String introduction;

    /**
     * 图书目录
     */
    private String directory;

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
     * 获取书名
     *
     * @return book_name - 书名
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 设置书名
     *
     * @param bookName 书名
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * 获取封面图片
     *
     * @return img_path - 封面图片
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * 设置封面图片
     *
     * @param imgPath 封面图片
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * 获取isbn
     *
     * @return isbn - isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * 设置isbn
     *
     * @param isbn isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取出版社
     *
     * @return press - 出版社
     */
    public String getPress() {
        return press;
    }

    /**
     * 设置出版社
     *
     * @param press 出版社
     */
    public void setPress(String press) {
        this.press = press;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取出版日期
     *
     * @return publication_time - 出版日期
     */
    public String getPublicationTime() {
        return publicationTime;
    }

    /**
     * 设置出版日期
     *
     * @param publicationTime 出版日期
     */
    public void setPublicationTime(String publicationTime) {
        this.publicationTime = publicationTime;
    }

    /**
     * 获取页数
     *
     * @return page_number - 页数
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * 设置页数
     *
     * @param pageNumber 页数
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * 获取入馆册数
     *
     * @return number - 入馆册数
     */
    public Short getNumber() {
        return number;
    }

    /**
     * 设置入馆册数
     *
     * @param number 入馆册数
     */
    public void setNumber(Short number) {
        this.number = number;
    }

    /**
     * 获取入库日期
     *
     * @return create_time - 入库日期
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置入库日期
     *
     * @param createTime 入库日期
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

    /**
     * 获取图书简介
     *
     * @return introduction - 图书简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置图书简介
     *
     * @param introduction 图书简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 获取图书目录
     *
     * @return directory - 图书目录
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * 设置图书目录
     *
     * @param directory 图书目录
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }
}