package com.xzkingdee.utils;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JoinerTest {

    @Test
    public void testJoinerSkipNull(){
        List<String> origin = Lists.newArrayList("aaa", "bbb", null, "ccc");
        String compare = "aaa-bbb-ccc";
        String join = Joiner.on('-').skipNulls().join(origin);
        System.out.println(join);
        assertThat(join,is(compare));
    }

    @Test
    public void testJoinerNoSkip(){
        List<String> origin = Lists.newArrayList("aaa", "bbb", null, "ccc");
        String compare = "aaa-bbb-ccc";
        String join = Joiner.on('-').useForNull("null").join(origin);
        System.out.println(join);
        assertThat(join,is(compare));
    }

    @Test
    public void testAppend(){
        List<String> origin = Lists.newArrayList("aaa", "bbb", null, "ccc");
        StringBuilder head = new StringBuilder("this is: ");
        StringBuilder result = Joiner.on('-').skipNulls().appendTo(head, origin);
        System.out.println(result);
        assertThat(result.toString(),is("this is: aaa-bbb-ccc"));
    }

    @Test
    public void testWithKeySperator(){
        Map<Integer, String> idNameMap = Maps.newHashMap();
        idNameMap.put(1, "Michael");
        idNameMap.put(2, "Mary");
        idNameMap.put(3, "Jane");

        String join = Joiner.on("\t").withKeyValueSeparator(":").join(idNameMap);
        System.out.println(join);
    }
}
