package com.hniu.mapper;

import com.hniu.entity.Permissions;
import java.util.List;

public interface PermissionsMapper {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(Permissions record);

    Permissions selectByPrimaryKey(Integer permissionId);

    List<Permissions> selectAll();

    int updateByPrimaryKey(Permissions record);
}