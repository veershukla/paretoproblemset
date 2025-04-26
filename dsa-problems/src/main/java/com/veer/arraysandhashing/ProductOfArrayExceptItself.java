package com.veer.arraysandhashing;

public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        int[] nums = {2,5,2,5};
        int[] result = productExceptSelf(nums);
        for(int x: result){
            System.out.print(x+" ");
        }
    }

    //bruteforce approach
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for( int i = 0; i<nums.length;i++){
            int product = 1;
            for( int j = 0 ;j<nums.length;j++){
                if( i != j ) {
                    product = product * nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }
}
