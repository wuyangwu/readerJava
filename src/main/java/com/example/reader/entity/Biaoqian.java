package com.example.reader.entity;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/28 14:10
 */
public class Biaoqian extends DataEntity {
    private int id;
    private String number;
    private String name;
    private int createPer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreatePer() {
        return createPer;
    }

    public void setCreatePer(int createPer) {
        this.createPer = createPer;
    }

    @Override
    public String toString() {
        return "Biaoqian{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", createPer='" + createPer + '\'' +
                '}';
    }
}
