class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // boolean ans = false;
        // for(int i =0; i< n; i++){
        //     for(int j = i+1; j < n; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //optimal approch
         
        //first sort the array
        // Arrays.sort(nums);
        // for(int i = 0; i < n-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        
        //optimal approch
        Set<Integer> uinq = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            //logic
            if(uinq.contains(nums[i])){
                return true;
            }
            uinq.add(nums[i]);
            
        }
        return false;
        
    }
}