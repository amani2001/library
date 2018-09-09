package com.hniu.mapper;

import com.hniu.entity.Logs;
import java.util.List;

public interface LogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logs record);

    Logs selectByPrimaryKey(Integer id);

    List<Logs> selectAll();

    int updateByPrimaryKey(Logs record);
}