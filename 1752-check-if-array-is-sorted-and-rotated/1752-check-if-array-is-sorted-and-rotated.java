class Solution {
    public boolean check(int[] nums) {
        
        
        //sudo logic
        //if array is broken one mean it sorted
        //but array sorted more then one it will definately not sorted
        
        // int i = 0;
        // for (int n : nums)
        // if (i == 0 || n > nums[i-1])
        //     nums[i++] = n;
        // return i;
        
        int response = 0;
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            
            if(nums[i] > nums[(i+1)%n]){
                response += 1;
            }
        }
        
        return response > 1 ? false : true;
        
//         int n = nums.length;
//         int cnt = 0;
//         for(int i = 1; i<n; i++){
//             if(nums[i-1] > nums[i]){
//                 cnt++;
//             }
//         }
        
//         if(nums[n-1] > nums[0]){
//             cnt++;
//         }
        
//         return cnt<=1;
            
      
    }
}