package com.xzkingdee.qy.algorithmTestDemo;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Follow up:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaxSubArray {
    /**
     * dynamic programming
     */
    public int maxSubArray(Integer[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int tempMax = nums[0];
            int sum = 0;
            for (int item : nums) {
                if (sum > 0) {
                    sum += item;
                } else {
                    sum = item;
                }
                tempMax = Math.max(tempMax, sum);
            }
            return tempMax;
        }
    }

    /**
     * Divide and conquer
     */
    public int maxSubArray1(Integer[] nums) {
        return divideAndConquer(nums, 0, nums.length - 1);
    }

    private int divideAndConquer(Integer[] nums, int left, int right) {
        if (left == right) return nums[left];
        int middle = (left + right) / 2;
        int leftMax = divideAndConquer(nums, left, middle);
        int rightMax = divideAndConquer(nums, middle + 1, right);
        int middleMax = computeMax(nums, left, right, middle);
        return Math.max(Math.max(leftMax, rightMax), middleMax);
    }

    private int computeMax(Integer[] nums, int left, int right, int middle) {
        if (left == right) return nums[left];

        int leftSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = middle; i > left - 1; --i) {
            currSum += nums[i];
            leftSum = Math.max(leftSum, currSum);
        }

        int rightSum = Integer.MIN_VALUE;
        currSum = 0;
        for (int i = middle + 1; i < right + 1; ++i) {
            currSum += nums[i];
            rightSum = Math.max(rightSum, currSum);
        }

        return leftSum + rightSum;
    }

    /**
     * Kadane Algorithm
     */
    public int maxSubArray2(Integer[] nums) {
        int n = nums.length, maxSum = nums[0];
        for (int i = 1; i < n; ++i) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }

    /**
     * Greedy Algorithm
     */
    public int maxSubArray3(Integer[] nums) {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];

        for (int i = 1; i < n; ++i) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
