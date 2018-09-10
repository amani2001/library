package com.hniu.service;

import java.util.List;

import com.hniu.entity.Roles;
import com.hniu.entity.vo.RoleVo;

public interface RoleService {
	//查询所有角色
	List<RoleVo> selectAll();

	//查询单个角色
	RoleVo selectByPrimaryKeyVo(Integer roleId);

	//更新角色信息
	int updateByPrimaryKey(Roles role);

	// 新增角色
	int insertRole(Roles role);

	//删除角色
	int deleteRole(Integer id);
}
