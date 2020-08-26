package com.letcode.jbook;

import java.util.Random;

/**
 * 1-1000放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现
 * 一次。每个数组元素只能访问一次，设计一个算法，将它找出来；不用辅助存储空
 * 间
 *
 * @author qy
 * @date Created in 2020/8/26
 **/
public class XorSample {
    public static void main(String[] args) {
        //TODO:数组乱序
        System.out.println(generateArr(10).toString());
    }

    private static int[] generateArr(int num) {
        int[] retArr = new int[num + 1];
        Random random = new Random();
        for (int i = retArr.length - 1; i > 0; i--) {
            retArr[i] = i;
        }
        return retArr;
    }
}
