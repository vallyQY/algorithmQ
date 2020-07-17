package com.xzkingdee.compare.compareable.dto;

import java.util.Comparator;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class LegDtoComparator implements Comparator<LegDto> {
    @Override
    public int compare(LegDto o1, LegDto o2) {
        return o2.getAge() - o1.getAge();
    }
}
