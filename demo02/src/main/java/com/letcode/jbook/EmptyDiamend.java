package com.letcode.jbook;

/**
 * description:
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/8/31
 */
public class EmptyDiamend {
    private static final int NUM = 10;

    public static void main(String[] args) {
        for (int i = 0; i < NUM; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
