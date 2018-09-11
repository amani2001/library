package com.hniu.entity.vo;

import java.util.List;

import com.hniu.entity.Permissions;

public class PermissionsVo extends Permissions {
    private List<Permissions> permissions;

    public List<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permissions> permissions) {
        this.permissions = permissions;
    }

}
