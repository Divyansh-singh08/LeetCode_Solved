class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
    // Method 1
        
            //         int ans[] = new int[nums.length];
            //         int k = 0;
            //         for(int i = 0,j = n; i < n; i++,j++){

            //             ans[k] = nums[i];
            //             k++;
            //             ans[k]=nums[j];
            //             k++;
            //         }
            //         return ans;
        
        
        
        
//********************************* // Method 2 **************************************************
        // in this method we have to deal with 
        // evenplace and odd place
        
        int ans[] = new int[nums.length];
        for(int i = 0 ;i < n; i++){
            ans[i*2] = nums[i];     //handle even index
            ans[i*2+1] = nums[n+i]; //handle the odd index
        }
        return ans;
        
        
        
    }
}