package com.example.reader.web.controller;

import com.example.reader.entity.Biaoqian;
import com.example.reader.entity.Book;
import com.example.reader.web.service.BiaoqianService;
import com.example.reader.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/13 12:53
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/home/select")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }

    @GetMapping("/home/select/{id}")
    public Book selectId(@PathVariable int id){
        return bookService.selectId(id);
    }
}
