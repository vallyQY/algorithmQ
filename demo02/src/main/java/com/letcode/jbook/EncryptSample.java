package com.letcode.jbook;

import java.util.Scanner;

/**
 * @author qy
 * @date Created in 2020/8/25
 **/
public class EncryptSample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the text:");
        String text = scan.nextLine();
        char[] charsToEncrypt = text.toCharArray();
        for (int i = 0; i < charsToEncrypt.length; i++) {
            charsToEncrypt[i] = (char) (charsToEncrypt[i] ^ 20000);
        }
        System.out.println("Encrypt or decrypt Result:");
        System.err.println(new String(charsToEncrypt));
    }
}
