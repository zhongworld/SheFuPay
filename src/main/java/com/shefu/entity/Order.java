package com.shefu.entity;

import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-03-12 14:32:25
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -12369154209540331L;
    
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}