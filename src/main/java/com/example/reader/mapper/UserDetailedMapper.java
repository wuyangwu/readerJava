package com.example.reader.mapper;

import com.example.reader.entity.UserDetailed;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailedMapper {

    public List<UserDetailed> selectAll();

    public UserDetailed selectUid(int uid);
}
