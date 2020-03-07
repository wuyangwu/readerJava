package com.example.reader.web.service;

import com.example.reader.entity.Biaoqian;
import com.example.reader.entity.Book;
import com.example.reader.mapper.BiaoqianMapper;
import com.example.reader.mapper.BookMapper;
import com.example.reader.web.util.PageHelpers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Autowired
    private BiaoqianMapper biaoqianMapper;

    // 不是分页版本
    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }
    // 通过标签id老查找书籍
    public List<Book> findBiaoQianId(int biaoqianid){
        return bookMapper.findBookOrBiaoqianId(biaoqianid);
    }

    // pageNum 是第几页
    public PageInfo<Book> selectAllPage(int pageNum){
        PageHelper.startPage(pageNum, PageHelpers.BookpageSize); // 设定当前页码，以及当前页显示的条数
        //PageHelper.offsetPage(pageNum, pageSize);也可以使用此方式进行设置
        List<Book> list = bookMapper.selectAll();
        PageInfo<Book> pageInfo = new PageInfo<Book>(list);
        return pageInfo;
    }
//    OR
//    public PageInfo selectList(Integer pageNum,Integer pageSize){
//        PageInfo<Student> pageInfo = PageHelper.startPage(1, 10).doSelectPageInfo(() -> studentMapper.selectList());
//        return pageInfo;
//    }
    public Book selectId(int id){
        return bookMapper.selectId(id);
    }
    // 不是分页版本
    public List<Book> findName(String name){
        return bookMapper.findName(name);
    }

    public PageInfo<Book> findNamePage(String name , int pageNum){
        PageHelper.startPage(pageNum, PageHelpers.BookpageSize);
        List<Book> list = bookMapper.findName(name);
        PageInfo<Book> pageInfo = new PageInfo<Book>(list);
        return pageInfo;
    }

    public List<Biaoqian> selectcount(){
        List<Biaoqian> list = biaoqianMapper.selectcount();
        for (Biaoqian biaoqian: list){
            biaoqian.setBooklistsize(biaoqian.getBookList().size());
        }
        return list;
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
