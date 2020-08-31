package com.letcode.jbook;

/**
 * description:计算圆周率π
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/8/28
 */
public class CircumferenceSample {
    private static final int NUM = 100;

    public static void main(String[] args) {
        //methodQ();
        cutMethod();
    }

    private static void methodQ() {
        double result = 0;
        for (int i = 1; i < NUM; i++) {
            result += buildItems(i);
        }
        System.out.println((result + 1) * 2);
    }

    private static double buildItems(int cursor) {
        double retItem = 1;
        for (int i = 1; i <= cursor; i++) {
            retItem *= ((double) i / (2 * i + 1));
        }
        return retItem;
    }

    private static void cutMethod() {
        double y = 1.0;
        for (int i = 0; i <= 10; i++) {
            double pai = 3 * Math.pow(2, i) * y;
            System.out.println("cut no:" + i + ".shape:" + (6 + 6 * i));
            System.out.println("pai approximately equal to:" + pai);
            y = Math.sqrt(2 - Math.sqrt(4 - y * y));
        }
    }
}
