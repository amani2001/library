package com.hniu.service.imp;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hniu.entity.BookTypes;
import com.hniu.entity.System;
import com.hniu.entity.vo.BookTypeMenu;
import com.hniu.entity.wrap.PageWrap;
import com.hniu.exception.SystemErrorException;
import com.hniu.mapper.BookTypesMapper;
import com.hniu.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    private BookTypesMapper bm;

    @Autowired
    protected System system;

    @Override
    public PageWrap selectAll(Integer pageNum, Integer pageSize) {
        if (pageSize == null)
            pageSize = system.getPageLine().intValue();
        if (pageNum == null)
            pageNum = 1;
        PageHelper.startPage(pageNum, pageSize);
        List<BookTypes> list = bm.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        return new PageWrap(pageInfo);
    }

    @Override
    public BookTypes selectByPrimaryKey(Integer id){
        return  bm.selectByPrimaryKey(id);
    }

    @Override
    public List selectMenus() {
        List<BookTypeMenu> list = bm.selectAllMenu();
        list.sort((x, y) -> Integer.parseInt(x.getFatherNode()) - Integer.parseInt(y.getFatherNode()));
        getChlidMenu(list, "0");
        return list;
    }


    //无限分级菜单
    private List<BookTypeMenu> getChlidMenu(List<BookTypeMenu> list, String fatherNode) {
        List<BookTypeMenu> result = new ArrayList<>();
        //获取子菜单
        for (BookTypeMenu menu : list) {
            if (menu.getFatherNode().equals(fatherNode)) {
                result.add(menu);
            }
        }
        //迭代子菜单的子菜单
        for (BookTypeMenu menu : result) {
            menu.setBookTypes(getChlidMenu(list, menu.getBookTypeId().toString()));
        }
        if (result.size() == 0) {
            return null;
        }
        return result;
    }

    @Override
    public BookTypes insert(BookTypes bookTypes) throws SystemErrorException {
        bookTypes.setBookTypeId(null);
        if (bm.insertSelective(bookTypes) > 0) {
            return bookTypes;
        } else {
            throw new SystemErrorException("系统错误");
        }
    }

    @Override
    public int update(BookTypes bookTypes) {
        return bm.updateByPrimaryKeySelective(bookTypes);
    }

    @Override
    public int delete(Integer id) {
        return bm.deleteByPrimaryKey(id);
    }
}
