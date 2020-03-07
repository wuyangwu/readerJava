package com.example.reader.web.service;

import com.example.reader.entity.User;
import com.example.reader.entity.UserLoginTime;
import com.example.reader.entity.Users;
import com.example.reader.mapper.UserLoginTimeMapper;
import com.example.reader.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/8/18 17:10
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserLoginTimeMapper userLoginTimeMapper;


    @Autowired
    private UserDetailedService userDetailedService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = userMapper.loadUserByUsername(username);
       if (user == null){
//           System.out.println("账户不存在");
           throw new UsernameNotFoundException("账户不存在");
       }
       Users users = new Users();
       UserLoginTime userLoginTime = new UserLoginTime();
       userLoginTime.setUid(user.getId());
       userLoginTime.setCreateTime(new Date());
       userLoginTimeMapper.add(userLoginTime);
       users.setEnabled(user.getEnabled());
       users.setId(user.getId());
       users.setUsername(username);
       // 这个里面又判断密码的
       users.setUserDetailed(userDetailedService.selectUid(user.getId()));
       users.setPassword(user.getPassword());
       users.setLocked(user.getLocked());
       users.setRoles(userMapper.getUserRolesByUid(user.getId()));
       return users;
//       return user;
    }

    public User findUsername(String username){
        return userMapper.loadUserByUsername(username);
    }
//    添加用户
    public void add(User user){
       userMapper.add(user);
       User user1 = userMapper.loadUserByUsername(user.getUsername());
//       插入权限
    }
}
