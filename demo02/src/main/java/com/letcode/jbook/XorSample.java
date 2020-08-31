package com.letcode.jbook;


import com.google.common.primitives.Ints;

import java.util.List;
import java.util.Optional;

/**
 * 1-1000放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现
 * 一次。每个数组元素只能访问一次，设计一个算法，将它找出来；不用辅助存储空
 * 间
 *
 * @author qy
 * @date Created in 2020/8/26
 **/
public class XorSample {
    private static final int ARR_LENGTH = 30000;

    public static void mothod() {
        List<Integer> origin = Ints.asList(GenerateArray.buildArray(ARR_LENGTH));
        Optional<Integer> total = origin.stream().reduce(Integer::sum);
        int sum = (ARR_LENGTH + 1) * ARR_LENGTH / 2;
        total.ifPresent(integer -> System.out.println(integer - sum));
    }

    public static void main(String[] args) {
        List<Integer> origin = Ints.asList(GenerateArray.buildArray(ARR_LENGTH));
        long start = System.currentTimeMillis();
        int temp = 0;
        for (Integer value : origin) {
            temp ^= value;
        }
        int tempOrigin = 0;
        for (int i = 1; i < ARR_LENGTH + 1; i++) {
            tempOrigin ^= i;
        }
        System.out.println("Repeat item:" + (temp ^ tempOrigin));
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");

        System.out.println("=====================");

        long startTime = System.currentTimeMillis();
        Optional<Integer> total = origin.stream().reduce(Integer::sum);
        int sum = (ARR_LENGTH + 1) * ARR_LENGTH / 2;
        total.ifPresent(integer -> System.out.println(integer - sum));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
    }
}
