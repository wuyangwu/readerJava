package com.example.reader.mapper;

import com.example.reader.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(Role record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Role record);

    /**
     *
     * @mbggenerated
     */
    Role selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Role record);
}