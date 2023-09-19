class Solution {
    public int findMaxConsecutiveOnes(int nums[]) {
        
//         int maxi = 0;
//         int ctn = 0;
//         for(int i = 0; i<nums.length; i++){
            
//             if(nums[i] == 1){
//                 ctn++;
//                 maxi = Math.max(maxi,ctn);
//             }else{
//                 ctn = 0;
//             }
//         }
        
//         return maxi;
        
        
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                count ++;
            }
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        return max;
        
        
        
        
        
    }
}
        
