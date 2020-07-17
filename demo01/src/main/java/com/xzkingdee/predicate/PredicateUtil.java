package com.xzkingdee.predicate;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author qy
 * @date Created in 2020/7/17
 **/
public class PredicateUtil {

    public static boolean testByPredicate(int value, Predicate<Integer> predicate) {
        return predicate.test(value);
    }

    public static boolean testAnd(String value, Predicate<String> predicateAnd, Predicate<String> predicate) {
        return predicate.and(predicateAnd).test(value);
    }

    public static boolean testNegate(Integer value, Predicate<Integer> predicate) {
        return predicate.negate().test(value);
    }

    public static boolean testOr(String value, Predicate<String> predicateOr, Predicate<String> predicate) {
        return predicate.or(predicateOr).test(value);
    }

    public static boolean testEqual(String value1, String value2) {
        return Predicate.isEqual(value1).test(value2);
    }

    /**
     * 内联使用，用于stream.filter中
     */
    public static boolean testInline() {
        List<String> names = Lists.newArrayList("siber", "taylor", "linda", "lena");
        List<String> collect = names.stream()
                .filter(((Predicate<String>) name -> name.startsWith("s")).and(name -> name.endsWith("r")))
                .collect(Collectors.toList());
        return collect.size() == 0;
    }

    /**
     * 组合使用,筛选选中值
     */
    public static List<String> testCombination(List<String> origin) {
        //FIXME
        List<Predicate<String>> allPredicates = new ArrayList<>();
        allPredicates.add(str -> str.toLowerCase().startsWith("a"));
        allPredicates.add(str -> str.contains("l"));
        allPredicates.add(str -> str.length() > 5);
        return origin.stream().filter(allPredicates.stream().reduce(x -> false, Predicate::or)).collect(Collectors.toList());
    }
}