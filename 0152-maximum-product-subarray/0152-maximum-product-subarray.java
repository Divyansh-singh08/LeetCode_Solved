class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int maxP = nums[0];
        for(int i = 0 ; i < nums.length; i++){
            //now make product
            prod = prod * nums[i];
            //..now check is prod is more then maxP
            if(prod > maxP){
                //update the maxP
                maxP = prod;
            }
            if(prod == 0){
                prod = 1;
            }
        }
        prod = 1;
        for(int j = nums.length - 1 ; j >= 0 ; j--){
            prod *= nums[j];
            if(prod > maxP){
                maxP = prod;
            }
            if(prod == 0){
                prod = 1;
            }
        }
        return maxP;
        
    }
}