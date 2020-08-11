package com.xzkingdee.hutool.clone;

import cn.hutool.core.clone.CloneSupport;
import lombok.Getter;
import lombok.Setter;

/**
 * @author qy
 * @date Created in 2020/8/11
 **/
@Getter
@Setter
public class Dog extends CloneSupport<Dog> {
    private String name = "Spark";
    private Integer age = 3;
}
