package com.example.reader.web.service;

import com.example.reader.entity.UserLoginTime;
import com.example.reader.mapper.UserLoginTimeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/4 14:40
 */
@Service
public class UserLoginTimeService {
    @Autowired
    private UserLoginTimeMapper userLoginTimeMapper;

    public UserLoginTime selectUid(int id){
        return userLoginTimeMapper.selectUid(id);
    }
}
