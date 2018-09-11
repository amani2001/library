package com.hniu.controller;

import com.hniu.constan.StateCode;
import com.hniu.entity.Admin;
import com.hniu.entity.vo.AdminVo;
import com.hniu.exception.NotLoginException;
import com.hniu.exception.PassWordErrorException;
import com.hniu.exception.SystemErrorException;
import com.hniu.exception.UserNameExistException;
import com.hniu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AdminController extends Base {

    @Autowired
    AdminService as;

    @GetMapping("/admins")
    public Object selectAll() {
        List<AdminVo> data = as.selectAllVo();
        if (data == null || data.isEmpty())
            return packaging(StateCode.SUCCESS, null);
        else
            return packaging(StateCode.SUCCESS, as.selectAllVo());
    }

    @GetMapping("/admins/{id}")
    public Object selectByPrimaryKey(@PathVariable("id") Integer id) {
        return packaging(StateCode.SUCCESS, as.selectByPrimaryKeyVo(id));
    }

    @PostMapping("/admins")
    public Object insert(Admin admin) {
        try {
            return packaging(StateCode.SUCCESS, as.insert(admin));
        } catch (UserNameExistException e) {
            return packaging(StateCode.USERNAMEEXIST, admin);
        } catch (SystemErrorException e) {
            return packaging(StateCode.FAIL, admin);
        }
    }

    @PutMapping("admins/{id}")
    public Object update(@PathVariable("id") Integer id, Admin admin) {
        admin.setAdminId(id);
        return packaging(StateCode.SUCCESS, as.update(admin));
    }

    @PutMapping("/admins/update_password")
    public Object updatePassword(String oldPassword, String newPassword) {
        try {
            return packaging(StateCode.SUCCESS, as.changePassword(oldPassword, newPassword));
        } catch (NotLoginException e) {
            return packaging(StateCode.LOGINAGAIN, null);
        } catch (PassWordErrorException e) {
            return packaging(StateCode.PASSWORDMISTAKE, oldPassword);
        }

    }

    @DeleteMapping("/admins/{id}")
    public Object delete(@PathVariable("id") Integer id) {
        int i = as.delete(id);
        if (i > 0)
            return packaging(StateCode.SUCCESS, null);
        else
            return packaging(StateCode.FAIL, null);

    }


}