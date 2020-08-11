package com.xzkingdee.hutool.clone;

import cn.hutool.core.clone.CloneSupport;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author qy
 * @date Created in 2020/8/11
 **/
@Setter
@Getter
public class Mouse extends CloneSupport<Mouse> implements Serializable {
    private Cat cat;
    private String name = "Jack";
    private Integer age = 1;
}
