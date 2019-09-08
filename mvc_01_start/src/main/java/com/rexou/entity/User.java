package com.rexou.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author qiushi 2019/9/6
 */
@Component
public class User {

    private String name;
    private Integer age;
    private Date birth;
    private Address addr;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
