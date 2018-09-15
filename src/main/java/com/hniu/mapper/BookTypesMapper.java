package com.hniu.mapper;

import com.hniu.entity.BookTypes;
import com.hniu.entity.vo.BookTypeMenu;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface BookTypesMapper extends Mapper<BookTypes> {
    public List<BookTypeMenu> selectAllMenu();
}