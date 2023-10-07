class Solution {
    
    
    public int longestConsecutive(int[] nums) {
        
        //Trying Better Approch
        // Sorting + Travers
        
        int n = nums.length;
        
        if(n == 0) return 0;
        
        Arrays.sort(nums);
        
        int smallValue = Integer.MIN_VALUE;
        int count = 0;
        int LCS = 1;
        
        for(int i = 0; i<n; i++){
            
            if(nums[i]-1 == smallValue){
                count++;
                smallValue = nums[i];
            }else if(nums[i] != smallValue){
                smallValue = nums[i];
                count = 1;
            }
            LCS = Math.max(LCS,count);
        }
        return LCS;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//     static Boolean linearSearch(int[]arr,int second){
        
//         int n = arr.length;
//         for(int i = 0; i<n; i++){
//             if(arr[i] == second){
//                 return true;
//             }
//         }
//         return false;
//     }
    
//     public int longestConsecutive(int[] nums) {
//         //Brute F0rce Approch O(N^2)
        
//         int n = nums.length;
        
//         //base case
//         if(n == 0) return 0;
        
//         int ans = 1;
//         for(int i = 0; i<n; i++){
//             int count = 1;
//             int first = nums[i];
            
//             while(linearSearch(nums,first+1) == true){
//                 first++;
//                 count++;
//             }
            
//             ans = Math.max(ans,count);
//         }
//         return ans;
        
        
//     }
}