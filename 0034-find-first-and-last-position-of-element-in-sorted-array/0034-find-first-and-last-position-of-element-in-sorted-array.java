class Solution {
    //need to store the index using call by 
    //function for each index should be call by BS algo
    
    static int searchFirst(int[] nums,int target){
        int low = 0;
        int heigh = nums.length-1;
        int res=-1;
        while(low <= heigh)
        {
            int mid = low + (heigh-low)/2;
            
            if(nums[mid] == target){
                res = mid;
                heigh = mid - 1;
                
            }else if(nums[mid] < target){
                low = mid + 1;
                
            }else{
                heigh = mid - 1;
            }
        }
        return res;
    }
    static int searchSecond(int[] nums,int target){
        int low = 0;
        int heigh = nums.length-1;
        int res = -1;
        while(low <= heigh)
        {
            int mid = low + (heigh-low)/2;
            
            if(nums[mid] == target){
                res = mid;
                low = mid+1;
                
            }else if(nums[mid] < target){
                low = mid + 1;
                
            }else{
                heigh = mid - 1;
            }
        } 
        return res;
    }
    
    public int[] searchRange(int[] nums, int target) {
        
        
        int[] arr = new int[2];
        int left = 0;
        int right = nums.length-1;
        arr[0] = searchFirst(nums,target);
        arr[1] = searchSecond(nums,target);
        return arr;
        
    }
}