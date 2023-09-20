class Solution {
    public int missingNumber(int[] nums) {
        
        //brute force approch
        int ans = 0;
        for(int i = 1; i<=nums.length; i++){
            
            int flag = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                ans = i;
            }
        }
        return  ans;
        
        
        //this is the best Approch not Optimal
//         int sum = 0; 
//         int n = nums.length;
//         int mis = (n*(n+1))/2;
//         for(int i = 0; i<n; i++){
//             sum = sum + nums[i];
//         }
        
//         return (mis-sum);
    }
}