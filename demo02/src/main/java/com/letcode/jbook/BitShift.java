package com.letcode.jbook;

import java.util.Scanner;

/**
 * 整数n左移a位，相当于n乘于2的a次方
 *
 * @author qy
 * @date Created in 2020/8/25
 **/
public class BitShift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a integer:");
        int input = Integer.parseInt(scan.nextLine());
        System.out.printf("%d * 16 = %d", input, input << 4);
    }
}
