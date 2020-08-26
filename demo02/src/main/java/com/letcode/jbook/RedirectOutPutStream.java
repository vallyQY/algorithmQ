package com.letcode.jbook;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 改变输出流，实现日志的效果。
 *
 * @author qy
 * @date Created in 2020/8/25
 **/
public class RedirectOutPutStream {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        try {
            PrintStream print = new PrintStream("./log.txt");
            System.setOut(print);
            int age = 11;
            System.out.printf("age:%d\n", age);
            String sex = "female";
            System.out.printf("gender:%s\n", sex);
            String info = String.format("Gender:%s,Age:%d", sex, age);
            System.out.println(info);
        } catch (FileNotFoundException e) {
            e.getCause();
        }
        System.setOut(printStream);
        System.out.println("end of program.see the detail in logs");
    }
}
