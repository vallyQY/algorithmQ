package com.xzkingdee.utils;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class SplitterTest {

    @Test
    public void testSpliListToIterable() {
        String str = "this, is  , , random , text,";

        ArrayList<String> resuleOrigin = Lists.newArrayList(str.split(","));
        System.out.println("Original Methods:" + Joiner.on('-').join(resuleOrigin));

        List<String> resultBySplitter = Splitter.on(',').trimResults().splitToList(str);
        System.out.println("Use splitter:" + Joiner.on('-').join(resultBySplitter));
    }

    @Test
    public void testSplitter(){
        String str1 = "~?~this, is~~ , , random , text,";
        List<String> result = Splitter.on(',').omitEmptyStrings().trimResults(CharMatcher.anyOf("~? ")).splitToList(str1);
        System.out.println(result);
    }

    @Test
    public void testSplitterToListWithCharMatcher(){
        String str = "a,b;c.d,e.f),g,h.i;j.1,2.3;";
        List<String> result = Splitter.on(CharMatcher.anyOf(",;.)")).omitEmptyStrings().splitToList(str);
        System.out.println(result);
    }

    @Test
    public void testSplitterWithPattern(){
        String str = "apple.banana,,orange,,.";
        List<String> result = Splitter.onPattern("[.|,]").omitEmptyStrings().trimResults().splitToList(str);
        System.out.println(result);
        assertEquals(3,result.size());
    }

    @Test
    public void testSplitterWithLenthFixed(){
        String str = "hello world";
        List<String> result = Splitter.fixedLength(3).trimResults().splitToList(str);
        System.out.println(result);
    }

    @Test
    public void testSplitterToMap(){
        String str = "John=first,Adam=second";
        Map<String, String> result = Splitter.on(',').withKeyValueSeparator('=').split(str);
        System.out.println(result.get("John"));
    }
}