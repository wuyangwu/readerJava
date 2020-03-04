package com.example.reader.mapper;

import com.example.reader.entity.UserLoginTime;
import org.springframework.stereotype.Repository;


@Repository
public interface UserLoginTimeMapper {

    public void add(UserLoginTime userLoginTime);

    public UserLoginTime selectUid(int uid);
}
