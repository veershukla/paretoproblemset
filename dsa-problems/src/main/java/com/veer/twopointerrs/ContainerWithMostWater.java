package com.veer.twopointerrs;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,1};
        int result = maxArea(heights);
        System.out.println(result);

    }
    public static int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length-1;
        while(l<r){
            int currentArea = Math.min(heights[l],heights[r])*(r-l);
            maxArea = Math.max(currentArea,maxArea);
            if( heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }
}
