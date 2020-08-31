package com.letcode.jbook;

/**
 * description:一个数组中元素，只有一个元素出现奇数次，其他都是偶数次。找到这个元素
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/8/28
 */
public class XorSample1 {

    public static void main(String[] args) {
        int[] arr = {22, 38, 38, 22, 22, 4, 4, 11, 11};
        int result = 0;
        for (int value : arr) {
            result ^= value;
        }
        System.out.println(result);
    }
}
