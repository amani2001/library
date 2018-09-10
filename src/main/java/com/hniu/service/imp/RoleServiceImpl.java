package com.hniu.service.imp;


import com.hniu.entity.Roles;
import com.hniu.entity.vo.RoleVo;
import com.hniu.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public List<RoleVo> selectAll() {
        return null;
    }

    @Override
    public RoleVo selectByPrimaryKeyVo(Integer roleId) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Roles role) {
        return 0;
    }

    @Override
    public int insertRole(Roles role) {
        return 0;
    }

    @Override
    public int deleteRole(Integer id) {
        return 0;
    }
}
