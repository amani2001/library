package com.hniu.service;


import com.hniu.entity.Admin;
import com.hniu.entity.Permissions;
import com.hniu.entity.vo.Menu;
import com.hniu.exception.NotLoginException;

import java.util.List;

public interface PermissionsService {
    public List<Permissions> selectPermissions(Admin admin);

    public List<Menu> selectMenu() throws NotLoginException;
}
