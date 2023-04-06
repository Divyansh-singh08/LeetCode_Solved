class Solution {
    public int findDuplicate(int[] nums) {
        
        //using Binary Search Tree
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            
            int mid = (low + high)/2;
            int count = 0;
            for(int j : nums){
                //condition must be check that
                if(j <= mid){
                    count++;
                }
            }
            
            //again check the condition
            if(count <= mid){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
        
    }
}