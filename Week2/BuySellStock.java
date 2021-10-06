package Week2;

public class BuySellStock {
    class Solution {
        public int maxProfit(int[] arr) {
            int min=arr[0];
            int profit = 0;
            for(int val:arr){
                min = Math.min(min, val);
               
                if( (val-min) > profit ){
                    profit = val-min;
                }
            }
            return profit;
        }
    }
}
