package com.xzkingdee.binaryoperator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class ReduceMethodTest {

    @Test
    public void testReduceFirst() {
        Optional<Integer> result = Stream.of(1, 2, 3, 4, 5).reduce((acc, item) -> {
            System.out.println("acc:\t" + acc);
            System.out.println("item:\t" + item);
            acc += item;
            System.out.println("accTotal:\t" + acc);
            System.out.println("------------------");
            return acc;
        });
        System.out.println(result.get());
    }

    @Test
    public void testReduceSecond(){
        Integer result = Stream.of(1, 2, 3, 4, 5, 6).reduce(100, Integer::sum);
        System.out.println(result);
    }

    /**
     * 可以实现对数据操作的同时转变数据的组织结构
     * */
    @Test
    public void testReduceThird(){
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6);
        ArrayList<String> result = numList.stream().reduce(new ArrayList<>(),(a,b)->{
            a.add("ele-"+b);
            return a;
        },(a,b)->null);
        System.out.println(result);
    }
}
