package com.hniu.controller;

import com.hniu.constan.StateCode;
import com.hniu.entity.Admin;
import com.hniu.exception.PassWordIsNullException;
import com.hniu.exception.UserNameIsNullException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController extends Base {

    @PostMapping("/login")
    public Object login(Admin admin) throws UserNameIsNullException, PassWordIsNullException {
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

}
