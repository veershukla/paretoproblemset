package com.veer.arraysandhashing;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s,t));
    }

    //bruteforce approach
    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if( Arrays.equals(sArray,tArray)) {
            return true;
        }
        return false;
    }
}
