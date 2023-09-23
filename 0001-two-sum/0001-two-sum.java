class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        //not the optimal approch 
        // int n = nums.length;
       //  for (int i = 0; i < n - 1; i++) {
       //      for (int j = i + 1; j < n; j++) {
       //          if (nums[i] + nums[j] == target) {
       //              return new int[]{i, j};
       //          }
       //      }
       //  }
       //  return new int[]{}; // No solution found  
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i = 0; i <nums.length; i++){
            
            int arrSum = nums[i];
            int moreNeed = target - arrSum;
            
            
            
            //check is map contains the value and index
            if(map.containsKey(moreNeed)){
                //yes present in the map
                ans[0] = map.get(moreNeed);
                ans[1] = i;
                return ans;
            }
            
            map.put(nums[i],i);
            
            
        }
        
     return ans;
        
        
    }
}