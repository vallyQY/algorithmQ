package com.xzkingdee.binaryoperator;

import com.google.common.collect.Lists;
import com.xzkingdee.compare.compareable.dto.NatDto;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class CompareAbleTest {

    @Test
    public void testCompareable() {
        List<NatDto> origin = Lists.newArrayList();
        NatDto natDto;
        for (int i = 0; i < 75; i++) {
            natDto = new NatDto("NatDto:" + i, i);
            origin.add(natDto);
        }
        Collections.shuffle(origin);
        //调用排序，需要提前实现Comparable接口并重写compareTo方法
        //Collections.sort(origin);
        origin.forEach(System.out::println);
    }
}