package com.hniu.mapper;

import com.hniu.entity.Borrows;
import java.util.List;

public interface BorrowsMapper {
    int deleteByPrimaryKey(Integer borrowId);

    int insert(Borrows record);

    Borrows selectByPrimaryKey(Integer borrowId);

    List<Borrows> selectAll();

    int updateByPrimaryKey(Borrows record);
}