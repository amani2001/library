package com.hniu.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hniu.entity.Admin;
import com.hniu.entity.Books;
import com.hniu.entity.System;
import com.hniu.entity.vo.RolesVo;
import com.hniu.entity.wrap.PageWrap;
import com.hniu.exception.SystemErrorException;
import com.hniu.mapper.BooksMapper;
import com.hniu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BooksMapper bm;

    @Autowired
    System system;

    @Override
    public int delete(Integer id) {
        return bm.deleteByPrimaryKey(id);
    }

    @Override
    public Books insert(Books books) throws SystemErrorException {
        books.setBookId(null);
        if (bm.insertSelective(books) > 0) {
            return books;
        } else {
            throw new SystemErrorException("系统错误");
        }
    }

    @Override
    public Books selectByPrimaryKeyVo(Integer id) {
        return bm.selectByPrimaryKey(id);
    }

    @Override
    public PageWrap selectAll(Integer pageNum, Integer pageSize) {
        if (pageSize == null)
            pageSize = system.getPageLine().intValue();
        if (pageNum == null)
            pageNum = 1;
        PageHelper.startPage(pageNum, pageSize);
        List<Books> list = bm.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        return new PageWrap(pageInfo);

    }

    @Override
    public int update(Books books) {
        return bm.updateByPrimaryKey(books);
    }
}
