package com.hniu.mapper;

import com.hniu.entity.BookStates;
import java.util.List;

public interface BookStatesMapper {
    int deleteByPrimaryKey(Integer bookStateId);

    int insert(BookStates record);

    BookStates selectByPrimaryKey(Integer bookStateId);

    List<BookStates> selectAll();

    int updateByPrimaryKey(BookStates record);
}