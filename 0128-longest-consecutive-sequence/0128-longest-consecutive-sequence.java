class Solution {
    
    
    //Make a final approch 
     public int longestConsecutive(int[] nums) {
         int n = nums.length;
         //create a map
         Map<Integer,Boolean> mapH = new HashMap<Integer,Boolean>();
         for(int val : nums){
             mapH.put(val,Boolean.FALSE);
         }
         
         
         //Edge case
         if(n == 0) return 0;
         
         // 100,4,200,1,3,2
         
         int LCS = 0;
         for(int i = 0; i<n; i++){
             
             int count = 1;
             //checking for the forward chaining
             int nextElement = nums[i]+1;
             while(mapH.containsKey(nextElement) && mapH.get(nextElement) == false){
                 count++;
                 mapH.put(nextElement,Boolean.TRUE);
                 nextElement++;
             }
             
             //checking for the backward chaining
             int PrevElement = nums[i] - 1;
             while(mapH.containsKey(PrevElement) && mapH.get(PrevElement) == false){
                 count++;
                 mapH.put(PrevElement,Boolean.TRUE);
                 PrevElement--;
             }
             
             LCS = Math.max(LCS,count);
             
         }
         return LCS;
     }
    
    
    
    
    
    
    
    
    
    
    
    
//      //Trying Better Approch
//     // Sorting + Travers
//     public int longestConsecutive(int[] nums) {
//         int n = nums.length;
        
//         //edge case
//         if(n == 0) return 0;
        
//         Arrays.sort(nums);
        
//         int smallValue = Integer.MIN_VALUE;
//         int count = 0;
//         int LCS = 1;
        
//         for(int i = 0; i<n; i++){
//             //making connecting chain by tracking the previous index
//             if(nums[i]-1 == smallValue){
//                 count++;
//                 smallValue = nums[i];
//             }else if(nums[i] != smallValue){
//                 smallValue = nums[i];
//                 count = 1;
//             }
//             LCS = Math.max(LCS,count);
//         }
//         return LCS;
        
//     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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