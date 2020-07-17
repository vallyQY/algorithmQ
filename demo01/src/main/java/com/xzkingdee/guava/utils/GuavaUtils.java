package com.xzkingdee.guava.utils;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import java.util.List;

/**
 * @author qy
 * @date Created in 2020/7/16
 **/
public class GuavaUtils {

    /**
     * 按照"-"拼接List中数据
     * */
    public static String joinByMiddleLine(List<String> origin){
        return Joiner.on("-").skipNulls().join(origin);
    }

    /**
     * 按照逗号分割字符串
     * */
    public static String splitString(String origin){
        Splitter splitter = Splitter.on(",").omitEmptyStrings().trimResults();
        return splitter.split(origin).toString();
    }

}
