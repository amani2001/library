package com.hniu.service;


import com.hniu.entity.Admin;
import com.hniu.entity.Books;
import com.hniu.entity.wrap.PageWrap;

public interface BookService {
    //删除图书
    int delete(Integer id);
    //新增图书
    Books insert(Admin admin);
    //查询指定图书
    Books selectByPrimaryKeyVo(Integer id);
    //查询所有图书
    PageWrap selectAllVo(Integer pageNum, Integer pageSize);
    //更改图书信息
    int update(Admin admin);
}
