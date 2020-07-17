package com.xzkingdee.compare;

import java.util.Comparator;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class CompareLen implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return (o1.length() - o2.length()) > 0 ? 1 : -1;
    }
}
