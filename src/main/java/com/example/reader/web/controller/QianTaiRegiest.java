package com.example.reader.web.controller;

import com.example.reader.entity.User;
import com.example.reader.web.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/7 19:38
 */
@RestController
@RequestMapping(value = "/qiantai")
public class QianTaiRegiest {
    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value = "/user/select/{username}")
    public int findName(@PathVariable String username){
        User user = userService.findUsername(username.trim().replaceAll("\\s+",""));
        if (user == null){
            logger.info("用户名没有使用过");
            return 0;
        }
        logger.info("用户名使用过");
        return 1;
    }

    @PostMapping(value = "/user/add")
    public void addUser(@RequestParam String name , @RequestParam String password){
        logger.info("注册");
        User user = new User();
        user.setUsername(name.trim().replaceAll("\\s+",""));
        user.setPassword(passwordEncoder.encode(password.trim().replaceAll("\\s+", "")));
        userService.add(user);
        logger.info("{}=注册成功",user.getUsername());
    }
}
