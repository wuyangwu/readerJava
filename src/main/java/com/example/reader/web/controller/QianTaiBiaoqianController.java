package com.example.reader.web.controller;

import com.example.reader.entity.Biaoqian;
import com.example.reader.entity.Book;
import com.example.reader.web.service.BiaoqianService;
import com.example.reader.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/6 18:02  前台标签页面
 */
@RestController
@RequestMapping(value = "/qiantai")
public class QianTaiBiaoqianController {
    @Autowired
    private BiaoqianService biaoqianService;

    @Autowired
    private BookService bookService;

    @GetMapping("/select")
    public List<Biaoqian> selectAll(){
        return biaoqianService.selectAll();
    }

    // 通过标签id来查找书籍
    @GetMapping("/selectBook/{biaoqianid}")
    public List<Book> selectBookOrbiaoqianid(@PathVariable int biaoqianid){
        if (biaoqianid == -1){
            return bookService.selectAll();
        }
        return bookService.findBiaoQianId(biaoqianid);
    }

    @GetMapping("/seletBook/find/{bookname}")
    public List<Book> selectFindBookName(@PathVariable String bookname){
        return bookService.findName(bookname);
    }
}
