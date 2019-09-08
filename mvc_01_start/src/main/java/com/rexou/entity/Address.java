package com.rexou.entity;

/**
 * @author qiushi 2019/9/6
 */
public class Address {
    private String city;
    private String strees;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", strees='" + strees + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStrees() {
        return strees;
    }

    public void setStrees(String strees) {
        this.strees = strees;
    }
}
