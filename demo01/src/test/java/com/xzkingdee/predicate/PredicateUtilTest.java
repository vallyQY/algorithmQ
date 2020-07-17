package com.xzkingdee.predicate;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class PredicateUtilTest {

    @Test
    public void testPredicateBase() {
        System.out.println(PredicateUtil.testByPredicate(2121, value -> String.valueOf(value).length() > 5));
        System.out.println(PredicateUtil.testByPredicate(22, value -> value % 2 == 0));
        System.out.println(PredicateUtil.testByPredicate(12, value -> value > 10));
    }

    @Test
    public void testPredicateAnd() {
        System.out.println(PredicateUtil.testAnd("deamon", value -> value.equals("deamon"), value -> value.length() > 3));
        Predicate<String> predicate = s -> s.length() < 3;
        System.out.println(predicate.test("111111"));
    }

    @Test
    public void testNegate(){
        System.out.println(PredicateUtil.testNegate(12,value->value.equals(21)));
    }

    @Test
    public void testOr(){
        System.out.println(PredicateUtil.testOr("test",value->value.length()>5,value->value.startsWith("w")));
    }

    @Test
    public void testEqual(){
        System.out.println(PredicateUtil.testEqual("sss","www"));
        System.out.println(PredicateUtil.testEqual(null,null));
        System.out.println(PredicateUtil.testEqual(null,"www"));
    }

    @Test
    public void testCombination(){
        List<String> names = Arrays.asList("Adam", "Alexander", "John", "Tom");
        System.out.println(PredicateUtil.testCombination(names));
    }
}
