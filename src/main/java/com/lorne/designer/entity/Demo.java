package com.lorne.designer.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * create by lorne on 2017/9/19
 */
@Table(name = "t_demo")
@Entity
public class Demo extends BaseEntity {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
