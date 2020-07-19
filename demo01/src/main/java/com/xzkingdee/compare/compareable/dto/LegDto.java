package com.xzkingdee.compare.compareable.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
@Setter
@Getter
public class LegDto{
    private String name;
    private Integer age;

    public LegDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "LegDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
}
