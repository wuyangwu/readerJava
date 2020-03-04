package com.example.reader.config.springsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * spring security 处理session失效和维登录的异常处理
 * @author wuyang
 * @version 1.0
 * @date 2019/9/18 16:46
 */
@RestController
public class SessionController {
    protected Logger logger = LoggerFactory.getLogger(getClass());

    @CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials = "true")
    @RequestMapping("/session/invalid")
//    @ResponseStatus(code = HttpStatus.UNAUTHORIZED) // 改变code
    public Map<String, String> SessionInvalid(){
        logger.info("session失效");
        Map<String,String> map = new HashMap<>();
        map.put("msgs","sessionFaile");
        // session过期
        return map;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials = "true")
    @RequestMapping("/login_page")
    public Map<String, String> Login(){
        logger.info("请先登录");
        Map<String,String> map = new HashMap<>();
        map.put("msgs","login");
        // session过期
        return map;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials = "true")
    @RequestMapping("/session/zhuxiao")
    public Map<String, String> zhuxiao(){
        logger.info("注销成功");
        Map<String, String> map = new HashMap<>();
        map.put("msg","以及注销成功返回登录页面");
        return map;
    }
}
