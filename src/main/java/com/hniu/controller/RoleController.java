package com.hniu.controller;

import com.hniu.entity.Roles;
import com.hniu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RoleController extends Base {

	@Autowired
	RoleService rs;

	// 查询所有角色
	@GetMapping("/roles")
	public Object selectAll() {
		return null;
	}

	// 查询指定id的角色
	@GetMapping("/roles/{roleId}")
	public Object selectRole(@PathVariable Integer roleId) {
		return null;
	}

	// 修改角色信息
	@PutMapping("/roles/{roleId}")
	public Object updateRole(@PathVariable Integer roleId, Roles role) {
		return null;
	}

	// 新增角色
	@PostMapping("/roles")
	public Object insertRole(Roles role) {
		return null;
	}

	// 删除角色
	@DeleteMapping("/roles/{roleId}")
	public Object deleteRole(@PathVariable Integer roleId) {
		return null;
	}
}
