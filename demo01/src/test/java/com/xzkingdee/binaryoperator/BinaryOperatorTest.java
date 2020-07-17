package com.xzkingdee.binaryoperator;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class BinaryOperatorTest {

    @Test
    public void testBinaryOperator(){
        BiFunction<Integer,Integer,Integer> func = Integer::sum;
        System.out.println(func.apply(1,2));

        BinaryOperator<Integer> funcBinary = (a,b)->null;
        System.out.println(funcBinary.apply(2,1));
    }

    @Test
    public void testWithReduce(){
        List<Integer> tempList = Lists.newArrayList(1,2,3,4,5,6,7,8,9);
        System.out.println(tempList.stream().reduce(Integer::sum));
    }
}