package com.letcode.jbook;

import java.util.Random;

/**
 * description: 生成乱序数据，数据元素只有一个重负。其余元素互不相等。
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/8/27
 */
public class GenerateArray {
    private static Random rand = new Random();

    public static int[] buildArray(int arrLength) {
        int[] temp = generateArr(arrLength);
        shuffle(temp);
        return temp;
    }

    private static int[] generateArr(int num) {
        int[] retArr = new int[num + 1];
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            retArr[i] = i + 1;
        }
        retArr[num] = retArr[random.nextInt(num)];
        return retArr;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void shuffle(int[] arr) {
        int length = arr.length;
        for (int i = length; i > 0; i--) {
            int randInd = rand.nextInt(i);
            swap(arr, randInd, i - 1);
        }
    }
}
