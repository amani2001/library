package com.hniu.mapper;

import com.hniu.entity.Cost;
import java.util.List;

public interface CostMapper {
    int deleteByPrimaryKey(Integer costId);

    int insert(Cost record);

    Cost selectByPrimaryKey(Integer costId);

    List<Cost> selectAll();

    int updateByPrimaryKey(Cost record);
}