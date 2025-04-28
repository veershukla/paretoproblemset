package com.veer.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "pwwkew";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }

    //bruteforce approach
    public static int lengthOfLongestSubstring(String s) {
        int longestSubStringLength = 0;
        char[] chars = s.toCharArray();
        for(int i =0;i<chars.length;i++){
            Set<Character> set = new HashSet<>();
            for (int j =i; j<chars.length;j++){
                char c = chars[j];
                if(set.contains(c)){
                    break;
                }
                set.add(c);
            }
            //check the size of set and update the max substring length
            longestSubStringLength = Math.max(longestSubStringLength,set.size());
        }
        return longestSubStringLength;
    }

    //optimized -TODO
    public static int lengthOfLongestSubstringOptimize(String s) {
       return 0;
    }
}
