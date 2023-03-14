class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minI = Integer.MAX_VALUE;
        int profit = 0;
        
        for(int i = 0; i < n; i++){
            if(prices[i]<minI){
                minI= prices[i];//update it
            }
            profit = Math.max(profit,prices[i]-minI);
        }
        return profit;
        
    }
}