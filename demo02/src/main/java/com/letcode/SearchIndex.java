package com.letcode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
 * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。你可以假设数组中无重复元素
 * 例:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 *
 * @author qy
 * @date 0720
 */
public class SearchIndex {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        for (; i < nums.length; ) {
            if (nums[i] > target) {
                break;
            }
            i++;
        }
        return i;
    }
}
