package com.hniu.mapper;

import com.hniu.entity.Readers;
import java.util.List;

public interface ReadersMapper {
    int deleteByPrimaryKey(Integer readerId);

    int insert(Readers record);

    Readers selectByPrimaryKey(Integer readerId);

    List<Readers> selectAll();

    int updateByPrimaryKey(Readers record);
}