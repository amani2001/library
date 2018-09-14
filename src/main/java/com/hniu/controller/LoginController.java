package com.hniu.controller;

import com.hniu.constan.StateCode;
import com.hniu.entity.Admin;
import com.hniu.exception.NotLoginException;
import com.hniu.exception.PassWordIsNullException;
import com.hniu.exception.UserNameIsNullException;
import com.hniu.service.PermissionsService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController extends Base {
    @Autowired
    PermissionsService ps;

    @PostMapping("/login")
    public Object login(@RequestBody Admin admin) throws UserNameIsNullException, PassWordIsNullException {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(admin.getAdminName(), admin.getPassword());
        try {
            subject.login(token);
        } catch (UserNameIsNullException uine) {
            return packaging(StateCode.USERNAMENOTNULL, token.getUsername());
        } catch (PassWordIsNullException pine) {
            return packaging(StateCode.PASSWORDNOTNULL, token.getUsername());
        } catch (UnknownAccountException uae) {
            return packaging(StateCode.USERNAMENOTEXIST, token.getUsername());
        } catch (IncorrectCredentialsException ice) {
            return packaging(StateCode.PASSWORDMISTAKE, token.getUsername());
        } catch (LockedAccountException lae) {
            return packaging(StateCode.USERNAMELOCK, token.getUsername());
        }
        return packaging(StateCode.SUCCESS, token.getUsername());
    }

    @GetMapping("/menu")
    public Object menu() {
        try {
            return packaging(StateCode.SUCCESS, ps.selectMenu());
        } catch (NotLoginException e) {
            return packaging(StateCode.LOGINAGAIN, null);
        }
    }
}
