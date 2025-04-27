package com.veer.twopointerrs;

public class TwoIntegerSumII {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int target = 3;
        int[] results = twoSum(nums, target);
        for( int r: results){
            System.out.print(r+ " ");
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        // array is sorted , go with two pointer approach
        int l = 0;
        int r = numbers.length-1;
        while(l<r){
            int sum  = numbers[l]+numbers[r];
            if(sum > target ) {
                r--;
            }else if( sum <target) {
                l++;
            }else{
                //sum == target
                return new int[]{l,r};
            }
        }
        return new int[0];
    }
}
