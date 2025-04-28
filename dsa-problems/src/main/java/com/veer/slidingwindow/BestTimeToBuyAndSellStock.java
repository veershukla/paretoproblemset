package com.veer.slidingwindow;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int responseBruteForce = maxProfit(prices);
        System.out.println("responseBruteForce="+responseBruteForce);
        int responseOptimized = maxProfitWithTwoPointer(prices);
        System.out.println("responseOptimized="+responseOptimized);
    }

    //bruteforce approach
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for( int i  = 0; i<prices.length;i++ ) {
            for (int j = i+1;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                maxProfit = Math.max(profit,maxProfit);
            }
        }
        return maxProfit;
    }

    //optimized approach
    public static int maxProfitWithTwoPointer(int[] prices) {
        int maxProfit = 0;
        int l = 0;
        int r = 1;
        while(r<prices.length){
            if( prices[r] > prices[l]) {
                int benefit = prices[r]-prices[l];
                maxProfit = Math.max(benefit,maxProfit);
            }else{
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
