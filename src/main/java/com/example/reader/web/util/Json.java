package com.example.reader.web.util;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/2 20:22
 */
public class Json {
    private int pageNum;  // 分页数
    private String  bookName; // 书籍名字

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Json{" +
                "pageNum=" + pageNum +
                ", bookName=" + bookName +
                '}';
    }
}
