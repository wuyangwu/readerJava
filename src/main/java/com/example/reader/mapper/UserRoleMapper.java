package com.example.reader.mapper;

import com.example.reader.entity.UserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper {

    public void updateOrId(UserRole userRole);
}