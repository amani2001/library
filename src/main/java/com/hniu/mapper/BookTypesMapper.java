package com.hniu.mapper;

import com.hniu.entity.BookTypes;
import java.util.List;

public interface BookTypesMapper {
    int deleteByPrimaryKey(Integer bookTypeId);

    int insert(BookTypes record);

    BookTypes selectByPrimaryKey(Integer bookTypeId);

    List<BookTypes> selectAll();

    int updateByPrimaryKey(BookTypes record);
}