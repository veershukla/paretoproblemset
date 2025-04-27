package com.veer.twopointerrs;

import java.util.*;

//two pointers + hashset
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-2,0,1,1,2};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //sort it
        Arrays.sort(nums); // to use two pointer approach
        Set<List<Integer>> result = new HashSet<>();
        for(int i =0; i<nums.length;i++){
            //use two sum approach
            int l = i+1;
            int r = nums.length-1;
            while(l<r) {
                int sum  = nums[i]+nums[l]+nums[r];
                if( sum >0) {
                    r--;
                }else if( sum<0){
                    l++;
                }else{
                    //sum equals to zeo
                    result.add(List.of(nums[i], nums[l], nums[r] ));
                    l++;
                    r--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
