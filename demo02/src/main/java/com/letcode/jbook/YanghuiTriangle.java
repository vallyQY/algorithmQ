package com.letcode.jbook;

/**
 * description:
 *
 * @author qy
 * @version v1.0
 * @date Created in 2020/8/28
 */
public class YanghuiTriangle {

    public static void main(String[] args) {
        pringAngle();
    }

    private static void pringAngle() {
        int[][] triAngle = new int[10][];
        for (int i = 0; i < triAngle.length; i++) {
            triAngle[i] = new int[i + 1];
            for (int j = 0; j < triAngle[i].length; j++) {
                if (i == 0 || j == 0 || j == triAngle[i].length - 1) {
                    triAngle[i][j] = 1;
                } else {
                    triAngle[i][j] = triAngle[i - 1][j - 1] + triAngle[i - 1][j];
                }
                System.out.print(triAngle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
