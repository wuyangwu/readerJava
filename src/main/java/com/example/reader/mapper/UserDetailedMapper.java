package com.example.reader.mapper;

import com.example.reader.entity.UserDetailed;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface UserDetailedMapper {

    public List<UserDetailed> selectAll();

    public UserDetailed selectUid(int uid);

    public List<UserDetailed> selectAlls();

    public void updateOrUid(int uid);

    public List<UserDetailed> selectUsername(@Param("username")  String username);
}
