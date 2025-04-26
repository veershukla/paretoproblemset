package com.veer.arraysandhashing;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums= {1,2,2,3,3,3};
        int k = 2;
        int[] result = topKFrequent(nums,k);
        for(int r: result) {
            System.out.print(r + " ");
        }
    }

    //bruteforce approach
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for ( int x: nums) {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<int[]> entries = new ArrayList<>(); // store map entries in list
        for( Map.Entry<Integer, Integer> entry: map.entrySet()){
             entries.add(new int[]{entry.getValue(),entry.getKey()});
        }
        entries.sort((a,b)->b[0]-a[0]); // reverse it by descending order
        int[] result = new int[k]; //store only k elements into the result
        for(int i =0; i<k; i++){
            result[i] = entries.get(i)[1];
        }
        return result;
    }
}
