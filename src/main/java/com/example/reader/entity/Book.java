package com.example.reader.entity;

import java.util.Date;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/11 21:24
 */
public class Book  extends  DataEntity{
    private int id;
    private String name;
    private String pricate;
    private String score;
    private String author;
    private String introduction;
    private String thumbsup;
    private String top;
    private String type;
    private String upauthor;
    private String bookUrl;
    private int biaoqianId;
    private int upauthorId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPricate() {
        return pricate;
    }

    public void setPricate(String pricate) {
        this.pricate = pricate;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getThumbsup() {
        return thumbsup;
    }

    public void setThumbsup(String thumbsup) {
        this.thumbsup = thumbsup;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpauthor() {
        return upauthor;
    }

    public void setUpauthor(String upauthor) {
        this.upauthor = upauthor;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public void setBookUrl(String bookUrl) {
        this.bookUrl = bookUrl;
    }

    public int getBiaoqianId() {
        return biaoqianId;
    }

    public void setBiaoqianId(int biaoqianId) {
        this.biaoqianId = biaoqianId;
    }

    public int getUpauthorId() {
        return upauthorId;
    }

    public void setUpauthorId(int upauthorId) {
        this.upauthorId = upauthorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pricate='" + pricate + '\'' +
                ", score='" + score + '\'' +
                ", author='" + author + '\'' +
                ", introduction='" + introduction + '\'' +
                ", thumbsup='" + thumbsup + '\'' +
                ", top='" + top + '\'' +
                ", type='" + type + '\'' +
                ", upauthor='" + upauthor + '\'' +
                ", bookUrl='" + bookUrl + '\'' +
                ", biaoqianId=" + biaoqianId +
                ", upauthorId=" + upauthorId +
                '}';
    }
}
