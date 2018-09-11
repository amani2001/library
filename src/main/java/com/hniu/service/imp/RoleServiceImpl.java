package com.hniu.service.imp;


import com.hniu.entity.Roles;
import com.hniu.entity.vo.RolesVo;
import com.hniu.mapper.RolesMapper;
import com.hniu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RolesMapper rm;

    @Override
    public List<RolesVo> selectAll() {
        return rm.selectAllVo();
    }

    @Override
    public RolesVo selectByPrimaryKeyVo(Integer roleId) {
        return rm.selectByPrimaryKeyVo(roleId);
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
