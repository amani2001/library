package com.hniu.service.imp;

import com.hniu.entity.Admin;
import com.hniu.entity.Permissions;
import com.hniu.entity.vo.Menu;
import com.hniu.entity.vo.PermissionsVo;
import com.hniu.entity.vo.RolesVo;
import com.hniu.exception.NotLoginException;
import com.hniu.service.PermissionsService;
import com.hniu.service.RoleService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermissionsServiceImpl implements PermissionsService {

    @Autowired
    RoleService rs;

    @Autowired
    PermissionsService ps;

    public List<Permissions> selectPermissions(Admin admin) {
        RolesVo role = rs.selectByPrimaryKeyVo(admin.getRoleId());
        List<Permissions> permissions = role.getPermissions();
        return permissions;
    }

    public List<Menu> selectMenu() throws NotLoginException {
        Admin admin = (Admin) SecurityUtils.getSubject().getSession().getAttribute("admin");
        if(admin == null){
            throw new NotLoginException();
        }
        List<Permissions> permissions = selectPermissions(admin);
        List<Menu> menus = new ArrayList<Menu>();
        for (Permissions p1 : permissions) {
            if (p1.getFatherNode() == 0) {
                Menu menu = new Menu();
                menu.setPermissions(p1);
                for (Permissions p2 : permissions) {
                    if (p2.getFatherNode() == p1.getPermissionId()) {
                        menu.getList().add(p2);
                    }
                }
                menus.add(menu);
            }
        }
        return menus;
    }
}
