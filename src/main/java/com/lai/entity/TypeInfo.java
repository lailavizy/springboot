package com.lai.entity;

import java.io.Serializable;

/**
 * (TypeInfo)实体类
 *
 * @author makejava
 * @since 2021-01-15 19:36:06
 */
public class TypeInfo implements Serializable {
    private static final long serialVersionUID = 981341566363737847L;
    /**
     * 编号
     */
    private Integer tid;
    /**
     * 名称
     */
    private String tname;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

}