class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i =0; i<nums.length; i++){
            
            if(nums[i] != 0){
                //moving or swapping zero to end
                //first make position empty to fill
                int temp = nums[j];
                //then put the non-zero value 
                nums[j] = nums[i];
                //replece with then zero value
                nums[i] = temp;
                j++;
            }
        }
    }
}