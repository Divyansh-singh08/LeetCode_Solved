class Solution {
    public int search(int[] nums, int target) {
        
        int ans = -1;
        int low = 0;
        int heigh = nums.length-1;
        while(low <= heigh){
            
            //there must be 3 case
            int mid = low + (heigh - low)/2;
            
            if(nums[mid] > target){
                heigh = mid-1;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                return mid;
            } 
        }
        return ans;
    }
}