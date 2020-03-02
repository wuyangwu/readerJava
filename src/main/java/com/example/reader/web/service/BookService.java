package com.example.reader.web.service;

import com.example.reader.entity.Book;
import com.example.reader.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/13 12:54
 */
@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }

    public Book selectId(int id){
        return bookMapper.selectId(id);
    }

    public List<Book> findName(String name){
        return bookMapper.findName(name);
    }

    public void add(Book book){
         bookMapper.add(book);
    }

    public Integer deleteId(int id){
        return bookMapper.deleteId(id);
    }

    public void UpdateOrId(Book book){
        bookMapper.updateOrid(book);
    }
}
