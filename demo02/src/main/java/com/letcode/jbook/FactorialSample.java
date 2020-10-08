package com.letcode.jbook;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * description:计算阶乘合
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/8/28
 */
public class FactorialSample {
    public static void main(String[] args) {
        BigDecimal sum = BigDecimal.ZERO;
        int i = 1;
        do {
            sum = sum.add(BigDecimal.ONE.divide(factorial(i++), 200, RoundingMode.HALF_UP));
        } while (i <= 100);
        System.out.println("1+1/2!+1/3!+...+1/20!=" + sum);
    }

    private static BigDecimal factorial(int i) {
        BigDecimal result = BigDecimal.ONE;
        if (i > 0) {
            for (int j = 1; j < i; j++) {
                result = result.multiply(BigDecimal.valueOf(j));
            }
        }
        return result;
    }
}
