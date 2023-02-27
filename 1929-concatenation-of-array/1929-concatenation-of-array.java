class Solution {
    public int[] getConcatenation(int[] nums) {
        
        //length of the nums
        int n = nums.length;
        int []ans = new int[2*n];//double the length
        for(int i = 0 ; i < ans.length; i++){
            //make a condition
            if(i < n){
                ans[i] = nums[i];
            }else{
                ans[i] = nums[i-n];
            }
            
        }
        return ans;
        
    }
}