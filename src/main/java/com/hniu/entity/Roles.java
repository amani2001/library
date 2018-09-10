package com.hniu.entity;

import javax.persistence.*;

@Table(name = "tbl_roles")
public class Roles {
    /**
     * 角色id
     */
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 是否可用
     */
    private Byte state;

    /**
     * 权限ids字符串
     */
    @Column(name = "permissions_str")
    private String permissionsStr;

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取是否可用
     *
     * @return state - 是否可用
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置是否可用
     *
     * @param state 是否可用
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取权限ids字符串
     *
     * @return permissions_str - 权限ids字符串
     */
    public String getPermissionsStr() {
        return permissionsStr;
    }

    /**
     * 设置权限ids字符串
     *
     * @param permissionsStr 权限ids字符串
     */
    public void setPermissionsStr(String permissionsStr) {
        this.permissionsStr = permissionsStr;
    }
}