package com.hniu.service.imp;

import com.hniu.entity.Admin;
import com.hniu.entity.vo.AdminVo;
import com.hniu.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {


    @Override
    public AdminVo selectByPrimaryKey(Integer adminId) {
        return null;
    }

    @Override
    public List<AdminVo> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Admin admin) {
        return 0;
    }

    @Override
    public int changePassword(String old, String young) {
        return 0;
    }

    @Override
    public int insertAdmin(Admin admin) {
        return 0;
    }

    @Override
    public int deleteAdmin(Integer id) {
        return 0;
    }
}
