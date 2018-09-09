package com.hniu.mapper;

import com.hniu.entity.System;
import java.util.List;

public interface SystemMapper {
    int deleteByPrimaryKey(Integer sysId);

    int insert(System record);

    System selectByPrimaryKey(Integer sysId);

    List<System> selectAll();

    int updateByPrimaryKey(System record);
}