package com.xzkingdee.hutool.clone;

import cn.hutool.core.clone.CloneRuntimeException;
import cn.hutool.core.clone.Cloneable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author qy
 * @date Created in 2020/8/11
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cat implements Cloneable<Cat>, Serializable {
    private String name = "Tom";
    private Integer age = 2;


    @Override
    public Cat clone() {
        try {
            return (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
