package com.hniu.mapper;

import com.hniu.entity.BorrowHistorys;
import java.util.List;

public interface BorrowHistorysMapper {
    int deleteByPrimaryKey(Integer historyId);

    int insert(BorrowHistorys record);

    BorrowHistorys selectByPrimaryKey(Integer historyId);

    List<BorrowHistorys> selectAll();

    int updateByPrimaryKey(BorrowHistorys record);
}