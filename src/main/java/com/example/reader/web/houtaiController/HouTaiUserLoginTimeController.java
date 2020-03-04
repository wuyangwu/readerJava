package com.example.reader.web.houtaiController;

import com.example.reader.entity.UserLoginTime;
import com.example.reader.web.service.UserLoginTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/4 14:42
 */
@RestController
@RequestMapping(value = "/houtai/userlogintime")
public class HouTaiUserLoginTimeController {
    @Autowired
    private UserLoginTimeService userLoginTimeService;

    @GetMapping(value = "/select/{uid}")
    public UserLoginTime selectUid(@PathVariable int uid){
        return userLoginTimeService.selectUid(uid);
    }
}
