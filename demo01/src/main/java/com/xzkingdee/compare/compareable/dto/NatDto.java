package com.xzkingdee.compare.compareable.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
@Setter
@Getter
public class NatDto implements Comparable<NatDto> {
    private String name;
    private Integer age;

    public NatDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(NatDto o) {
        return  o.getAge() - this.age;
    }

    @Override
    public String toString() {
        return "NatDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
