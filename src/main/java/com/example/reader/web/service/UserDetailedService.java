package com.example.reader.web.service;

import com.example.reader.entity.User;
import com.example.reader.entity.UserDetailed;
import com.example.reader.entity.UserRole;
import com.example.reader.mapper.UserDetailedMapper;
import com.example.reader.web.util.PageHelpers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/12 16:37
 */
@Service
public class UserDetailedService {

    protected Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserDetailedMapper userDetailedMapper;

    public UserDetailed selectUid(int uid){
        return userDetailedMapper.selectUid(uid);
    }

    public PageInfo<UserDetailed> selectAlss(int pageNum){
        PageHelper.startPage(pageNum, PageHelpers.UserDetailsSize);
        List<UserDetailed> list = userDetailedMapper.selectAlls();
        PageInfo<UserDetailed> pageInfo = new PageInfo<UserDetailed>(list);
        logger.info("用户总数为={}",list.size());
        pageInfo.setTotal(list.size());
        return pageInfo;
    }

    public void deleteUid(int uid){
        userDetailedMapper.updateOrUid(uid);
    }

    public List<UserDetailed> findOrUsername(String username){
       return userDetailedMapper.selectUsername(username);
    }

}
