package com.example.reader.web.service;

import com.example.reader.entity.UserDetailed;
import com.example.reader.mapper.UserDetailedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/12 16:37
 */
@Service
public class UserDetailedService {

    @Autowired
    private UserDetailedMapper userDetailedMapper;

    public UserDetailed selectUid(int uid){
        return userDetailedMapper.selectUid(uid);
    }

}
