package com.letcode.robot;

/**
 * @author qy
 * @date 2020/7/26
 */
public interface Robot {
    /**
     * 若下一个方格为空，则返回true，并移动至该方格
     * 若下一个方格为障碍物，则返回false，并停留在原地
     */
    boolean move();

    /**
     * 在调用turnLeft/turnRight后机器人会停留在原位置
     * 每次转弯90度
     */
    void turnLeft();

    /**
     * 在右转
     * 每次转弯90度
     */
    void turnRight();

    /**
     * 清理所在方格
     */
    void clean();
}
