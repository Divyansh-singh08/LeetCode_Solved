class Solution {
    public int maxProfit(int[] prices) {
        
        
        //Let do it using Kadane Alogrithm
        
        int maxAlltime = 0;
        int maxValue = 0;
        for(int i = 1; i<prices.length; i++){
            //check is  price is max or not
            //we only take positive value so that why we use 0 any greater then 0
            //
            maxValue = Math.max(0,maxValue += prices[i] - prices[i-1]);
            maxAlltime = Math.max(maxAlltime,maxValue);
        }
        
        return maxAlltime;
        
        
//         int maxProfit = 0;
//         int minValue = Integer.MAX_VALUE;
//         //ITERATE To the array
//         for(int i = 0; i<prices.length; i++){
//             //Condition for checking the minValue 
//             //so that we can take max profit
//             if(prices[i] < minValue){
//                 //if true prices[i] will now min value
//                 minValue = prices[i];
//             }
//             //now check Max profit
//             // iterate to the array and check the max profit 
//             maxProfit = Math.max(maxProfit,(prices[i] - minValue));
            
//         }
        
//         return maxProfit;
        
        
        
    }
}