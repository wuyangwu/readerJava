package com.example.reader.entity;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/11 21:28
 */
public class UserDetailed    extends DataEntity {
    private int id;
    private String username;
    private int leavel;
    private String signature;
    private int uid;
    private String pricate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLeavel() {
        return leavel;
    }

    public void setLeavel(int leavel) {
        this.leavel = leavel;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPricate() {
        return pricate;
    }

    public void setPricate(String pricate) {
        this.pricate = pricate;
    }

    @Override
    public String toString() {
        return "UserDetailed{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", leavel=" + leavel +
                ", signature='" + signature + '\'' +
                ", uid=" + uid +
                ", pricate='" + pricate + '\'' +
                '}';
    }
}