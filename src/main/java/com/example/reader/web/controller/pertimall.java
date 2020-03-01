package com.example.reader.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/9/10 20:22
 */
@RestController
@RequestMapping("/permit")
public class pertimall {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/all")
    public String permit(String a, HttpServletRequest request) {

        return "helloword"+a;
    }
    // 测试密码加密S
    @GetMapping("/password")
    public String password(String password){
        return passwordEncoder.encode(password);
    }
}
