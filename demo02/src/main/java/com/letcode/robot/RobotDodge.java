package com.letcode.robot;

import java.util.HashSet;
import java.util.Set;

/**
 * 房间（用格栅表示）中有一个扫地机器人。
 * 格栅中的每一个格子有空和障碍物两种可能。
 * <p>
 * 扫地机器人提供4个API，可以向前进，向左转或者向右转。每次转弯90度。
 * <p>
 * 当扫地机器人试图进入障碍物格子时，它的碰撞传感器会探测出障碍物，使它停留在原地。
 * <p>
 * 请利用提供的4个API编写让机器人清理整个房间的算法。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * room = [
 * [1,1,1,1,1,0,1,1],
 * [1,1,1,1,1,0,1,1],
 * [1,0,1,1,1,1,1,1],
 * [0,0,0,1,0,0,0,0],
 * [1,1,1,1,1,1,1,1]
 * ],
 * row = 1,
 * col = 3
 * <p>
 * 解析:
 * 房间格栅用0或1填充。0表示障碍物，1表示可以通过。
 * 机器人从row=1，col=3的初始位置出发。在左上角的一行以下，三列以右。
 * <p>
 * 注意:
 * <p>
 * 输入只用于初始化房间和机器人的位置。你需要“盲解”这个问题。
 * 换而言之，你必须在对房间和机器人位置一无所知的情况下，只使用4个给出的API解决问题。
 * 扫地机器人的初始位置一定是空地。
 * 扫地机器人的初始方向向上。
 * 所有可抵达的格子都是相连的，亦即所有标记为1的格子机器人都可以抵达。
 * 可以假定格栅的四周都被墙包围。
 *
 * @author qy
 * @date 2020/7/26
 */
public class RobotDodge {
    private int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public void cleanRoom(Robot robot) {
        Set<String> visited = new HashSet<>();
        backtracking(robot, visited, 0, 0, 0);
    }

    private void backtracking(Robot robot, Set<String> visited, int x, int y, int arrow) {
        String path = x + "-" + y;
        if (visited.contains(path)) return;
        visited.add(path);
        robot.clean();

        for (int i = 0; i < 4; i++) {
            if (robot.move()) {
                //go all the way till cannot move, then back one step
                int nx = x + dir[arrow][0];
                int ny = y + dir[arrow][1];

                backtracking(robot, visited, nx, ny, arrow);
                //trace back
                robot.turnLeft();
                robot.turnLeft();
                robot.move();
                robot.turnLeft();
                robot.turnLeft();
            }
            robot.turnLeft();// or turnRight();
            arrow = (arrow + 1) % 4;
        }
    }
}
