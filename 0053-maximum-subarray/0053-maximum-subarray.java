class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxE = nums[0];//first element can be include
        for(int i = 0; i< nums.length; i++){
            sum = sum + nums[i];
            //now check the sum is more then maxE or not
            if(sum > maxE){
                maxE = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxE;
        
        
    }
}