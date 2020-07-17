package com.xzkingdee.compare;

import java.util.Comparator;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class CompareSingle implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
