package com.hniu.mapper;

import com.hniu.entity.Permissions;
import com.hniu.entity.vo.PermissionsVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface PermissionsMapper extends Mapper<Permissions> {

    public List<PermissionsVo> test();
}