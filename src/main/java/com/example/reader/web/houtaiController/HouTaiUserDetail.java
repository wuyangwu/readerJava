package com.example.reader.web.houtaiController;

import com.example.reader.entity.UserDetailed;
import com.example.reader.web.service.UserDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/3 13:28
 */
@RestController
@RequestMapping(value = "/user")
public class HouTaiUserDetail {
    @Autowired
    private UserDetailedService userDetailedService;

    @GetMapping("/select/{uid}")
    public void selectUid(@PathVariable int uid){
    }
}
