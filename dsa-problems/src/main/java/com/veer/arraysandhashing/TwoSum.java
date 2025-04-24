package com.veer.arraysandhashing;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        int target = 7;
        int[] result = twoSum(nums,target);
        for(int x : result) {
            System.out.println(x);
        }
    }

    //bruteforce
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if( nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[-1];
    }
}
