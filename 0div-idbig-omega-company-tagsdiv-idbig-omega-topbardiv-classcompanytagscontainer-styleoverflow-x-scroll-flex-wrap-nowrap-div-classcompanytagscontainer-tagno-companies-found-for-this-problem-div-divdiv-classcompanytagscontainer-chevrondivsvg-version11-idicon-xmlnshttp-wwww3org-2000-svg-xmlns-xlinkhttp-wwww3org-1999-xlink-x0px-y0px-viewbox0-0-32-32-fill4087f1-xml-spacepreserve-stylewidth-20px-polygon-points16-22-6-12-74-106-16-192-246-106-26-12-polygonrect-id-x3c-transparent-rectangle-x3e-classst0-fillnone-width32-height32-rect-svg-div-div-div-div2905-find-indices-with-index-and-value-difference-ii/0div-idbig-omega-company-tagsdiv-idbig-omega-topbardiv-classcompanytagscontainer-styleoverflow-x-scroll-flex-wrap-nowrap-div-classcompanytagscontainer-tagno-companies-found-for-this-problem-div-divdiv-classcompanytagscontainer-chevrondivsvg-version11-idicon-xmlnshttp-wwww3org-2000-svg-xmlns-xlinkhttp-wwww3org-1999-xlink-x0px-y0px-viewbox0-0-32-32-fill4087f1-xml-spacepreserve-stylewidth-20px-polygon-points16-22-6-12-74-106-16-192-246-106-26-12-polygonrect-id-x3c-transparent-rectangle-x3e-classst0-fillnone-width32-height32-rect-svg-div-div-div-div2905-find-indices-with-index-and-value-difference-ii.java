class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
            
    
        //first of all 
        int min = 0;
        int max = 0;
        
        for(int i = 0, j = indexDifference; j<nums.length; j++, i++){
            if(nums[min] > nums[i]){
                min = i;
            }
            
            if(nums[max] < nums[i]){
                max = i;
            }
            
            if(Math.abs(nums[min] - nums[j]) >= valueDifference){
                return new int[]{min,j};
            }
            
            if(Math.abs(nums[max] - nums[j]) >= valueDifference){
                return new int[]{max,j};
            }
        }
        
        return new int[]{-1,-1};
        
    }
}