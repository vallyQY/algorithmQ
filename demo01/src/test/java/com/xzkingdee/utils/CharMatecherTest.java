package com.xzkingdee.utils;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * @author qy
 * @date Created in 2020/7/16
 **/
public class CharMatecherTest {

    @Test
    public void testMethod(){
        System.out.println(CharMatcher.is('a').removeFrom("acvd"));
        System.out.println(CharMatcher.inRange('a','b').replaceFrom("eabcvdf","hh"));

    }

    @Test
    public void withKeyValueSeparatorTest(){
        Map<Integer, String> idNameMap = Maps.newHashMap();
        idNameMap.put(1, "Michael");
        idNameMap.put(2, "Mary");
        idNameMap.put(3, "Jane");

        String result = Joiner.on("\n").withKeyValueSeparator(":").join(idNameMap);
        System.out.println(result);
    }
}