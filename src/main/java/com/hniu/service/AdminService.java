package com.hniu.service;

import java.util.List;

import com.hniu.entity.Admin;
import com.hniu.entity.vo.AdminVo;

public interface AdminService {

	// 查询指定id的用户信息
	AdminVo selectByPrimaryKey(Integer adminId);

	// 查询所有用户信息
	List<AdminVo> selectAll();

	// 修改用户信息
	int updateByPrimaryKey(Admin admin);

	// 修改自己密码
	int changePassword(String old, String young);

	// 新增管理员
	int insertAdmin(Admin admin);

	//删除
	int deleteAdmin(Integer id);
}
