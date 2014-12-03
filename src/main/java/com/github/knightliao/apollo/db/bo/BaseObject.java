package com.github.knightliao.apollo.db.bo;

import java.io.Serializable;

/**
 * 使用GenericDao做映射的对象，必须都继承与这个类
 * 
 * @author Darwin(Tianxin)
 */
public class BaseObject<KEY extends Serializable> implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 主键字段
     */
    protected KEY id;

    public BaseObject() {
    }

    public KEY getId() {
        return id;
    }

    public void setId(KEY id) {
        this.id = id;
    }

}
