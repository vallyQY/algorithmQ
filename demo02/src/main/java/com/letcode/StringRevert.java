package com.letcode;

/**
 * @author qy
 * @date 2020/7/21
 */
public class StringRevert {
    public static String revertString(String origin) {
        StringBuilder result = new StringBuilder();
        if (origin != null) {
            String[] split = origin.split("");
            for (int i = split.length - 1; i >= 0; i--) {
                result.append(split[i]);
            }
            return result.toString();
        } else {
            return null;
        }
    }

    public static String revertStringAdd(String origin) {
        char[] chrArr = origin.toCharArray();
        int i = 0;
        int j = chrArr.length - 1;
        while (i < j) {
            char temp = chrArr[i];
            chrArr[i] =  chrArr[j];
            chrArr[j] = temp;
            i++;
            j--;
        }
        return new String(chrArr);
    }
}
