package com.letcode.jbook;

/**
 * 整数，使用异或进行互换。可以不借助第三方变量
 *
 * 原理：异或具有自反性
 * @author qy
 * @date Created in 2020/8/25
 **/
public class IntegerSwap {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + ":" + b);
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println("Swap result");
        System.out.println(a + ":" + b);
    }
}
