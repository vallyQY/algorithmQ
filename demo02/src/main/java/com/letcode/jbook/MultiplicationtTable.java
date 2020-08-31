package com.letcode.jbook;

/**
 * description:
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/8/28
 */
public class MultiplicationtTable {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j+"\t");
            }
            System.out.println();
        }
    }
}
