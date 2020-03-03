package com.example.reader.mapper;

import com.example.reader.entity.User;
import com.example.reader.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User loadUserByUsername(String username);

    List<Role> getUserRolesByUid(int id);
}