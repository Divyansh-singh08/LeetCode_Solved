class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i<n; i++){
            int ans1 = nums[i];
            int ctn = 0;
            for(int j = 0; j<n; j++){
                
                if(nums[j] == ans1){
                    ctn++;
                }
            }
            if(ctn == 1){
                ans = ans1;
            }
        }
        return ans;
    }
}