package com.hniu.service;

import com.hniu.entity.BookTypes;
import com.hniu.entity.wrap.PageWrap;
import com.hniu.exception.SystemErrorException;

import java.util.List;

public interface BookTypeService {
    //管理员分页查询图书分类
    PageWrap selectAll(Integer pageNum, Integer pageSize);

    BookTypes selectByPrimaryKey(Integer id);

    //客户端查询分级图书分类
    List selectMenus();

    //插入图书分类
    BookTypes insert(BookTypes bookTypes) throws SystemErrorException;

    //更新图书分类
    int update(BookTypes bookTypes);


    //删除图书分类
    int delete(Integer id);
}
