package com.hzgj.entity;

import java.io.Serializable;

//大分类模型
public class SuperType implements Serializable {
    //属性:
    private Integer id;//大分类类型的编号
    private String typeName;//大分类类型的名称

    //方法:getter和setter方法:
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
 