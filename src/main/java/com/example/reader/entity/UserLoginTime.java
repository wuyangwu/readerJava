package com.example.reader.entity;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/3/4 14:19
 */
public class UserLoginTime extends DataEntity {
    private int id;
    private int uid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
