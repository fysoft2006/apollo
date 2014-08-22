package com.github.knightliao.apollo.db.bo;

import java.io.Serializable;

/**
 * 所有bo的父类
 * 
 * @author liaoqiqi
 * @version 2014-8-22
 * @param <KEY>
 */
public class BaseObject<KEY extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;

    public BaseObject() {
    }

    /**
     * 主键字段
     */
    protected KEY id;

    public KEY getId() {
        return id;
    }

    public void setId(KEY id) {
        this.id = id;
    }

}
