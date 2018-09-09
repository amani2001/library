package com.hniu.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

    @GetMapping("login")
    public String s1() {
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken("123","123"));
        return "login";
    }

    @GetMapping("hello")
    public String s2() {
        return "hello";
    }

    @RequiresPermissions("per")
    @GetMapping("hello2")
    public String s4() {
        return "hello2";
    }

    @GetMapping("error")
    public String s3() {
        return "error";
    }

}
