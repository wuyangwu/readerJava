package com.example.reader.entity;

import java.util.Date;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/11/11 21:30
 */
public class DataEntity {
    protected String remarks; //描述
    protected Date createTime;
    protected String delflag; //删除状态

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDelflag() {
        return delflag;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }
}
