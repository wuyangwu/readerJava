package com.example.reader.web.houtaiController;

import com.example.reader.entity.Biaoqian;
import com.example.reader.entity.Book;
import com.example.reader.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/29 23:41  书籍管理页面
 */
@RestController
@RequestMapping(value = "/houtai/book")
public class HouTaiBookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/select")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
    @GetMapping("/select/{id}")
    public void se(@PathVariable String id){
        System.out.println(id);
    }

    @GetMapping("/findname/{name}")
    public List<Book> findName(@PathVariable String name){
        return bookService.findName(name);
    }
}
