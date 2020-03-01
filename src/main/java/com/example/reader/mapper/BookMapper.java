package com.example.reader.mapper;


import com.example.reader.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    public List<Book> selectAll();

    public Book selectId(int id);

    public List<Book> findName(@Param("name") String name);
}
