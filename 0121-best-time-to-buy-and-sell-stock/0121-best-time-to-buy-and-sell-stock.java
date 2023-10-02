class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int minValue = Integer.MAX_VALUE;
        //ITERATE To the array
        for(int i = 0; i<prices.length; i++){
            //Condition for checking the minValue 
            //so that we can take max profit
            if(prices[i] < minValue){
                //if true prices[i] will now min value
                minValue = prices[i];
            }
            //now check Max profit
            // iterate to the array and check the max profit 
            maxProfit = Math.max(maxProfit,(prices[i] - minValue));
            
        }
        
        return maxProfit;
        
        
        
    }
}