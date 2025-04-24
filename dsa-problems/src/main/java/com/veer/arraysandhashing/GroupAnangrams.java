package com.veer.arraysandhashing;

import java.util.*;

public class GroupAnangrams {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);

    }

    //bruteforce approach
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for( String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorrtedString = new String(charArray);
            map.putIfAbsent(sorrtedString,new ArrayList<>());
            map.get(sorrtedString).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
