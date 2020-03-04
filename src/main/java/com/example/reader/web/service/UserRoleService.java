package com.example.reader.web.service;

import com.example.reader.entity.UserRole;
import com.example.reader.mapper.UserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/8/18 17:10
 */
@Service
public class UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    public void updateOrRid(UserRole userRole){
        userRoleMapper.updateOrId(userRole);
    }
}
