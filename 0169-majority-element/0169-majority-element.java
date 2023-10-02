class Solution {
    public int majorityElement(int[] nums) {
        
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        
        //solve using Moores voting alogrithem
        
        int count = 0;
        int current = 0;
        
        for(int i = 0; i<nums.length; i++){
            
            if(count == 0){
                current = nums[i];
            }
            
            if(nums[i] == current){
                count++;
            }else{
                count--;
            }
            
        }
        
        return current;
        
        
    }
}