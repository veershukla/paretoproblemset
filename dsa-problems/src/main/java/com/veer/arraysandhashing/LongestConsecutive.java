package com.veer.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {1,0,1,2};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    //hashset usage
    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        for( int num : nums) {
            if( !set.contains(num-1)) {
                int length = 1;
                while( set.contains(num+length)){
                    length = length +1;
                }
                longest = Math.max(longest,length);
            }
        }

        return longest;
    }
}
