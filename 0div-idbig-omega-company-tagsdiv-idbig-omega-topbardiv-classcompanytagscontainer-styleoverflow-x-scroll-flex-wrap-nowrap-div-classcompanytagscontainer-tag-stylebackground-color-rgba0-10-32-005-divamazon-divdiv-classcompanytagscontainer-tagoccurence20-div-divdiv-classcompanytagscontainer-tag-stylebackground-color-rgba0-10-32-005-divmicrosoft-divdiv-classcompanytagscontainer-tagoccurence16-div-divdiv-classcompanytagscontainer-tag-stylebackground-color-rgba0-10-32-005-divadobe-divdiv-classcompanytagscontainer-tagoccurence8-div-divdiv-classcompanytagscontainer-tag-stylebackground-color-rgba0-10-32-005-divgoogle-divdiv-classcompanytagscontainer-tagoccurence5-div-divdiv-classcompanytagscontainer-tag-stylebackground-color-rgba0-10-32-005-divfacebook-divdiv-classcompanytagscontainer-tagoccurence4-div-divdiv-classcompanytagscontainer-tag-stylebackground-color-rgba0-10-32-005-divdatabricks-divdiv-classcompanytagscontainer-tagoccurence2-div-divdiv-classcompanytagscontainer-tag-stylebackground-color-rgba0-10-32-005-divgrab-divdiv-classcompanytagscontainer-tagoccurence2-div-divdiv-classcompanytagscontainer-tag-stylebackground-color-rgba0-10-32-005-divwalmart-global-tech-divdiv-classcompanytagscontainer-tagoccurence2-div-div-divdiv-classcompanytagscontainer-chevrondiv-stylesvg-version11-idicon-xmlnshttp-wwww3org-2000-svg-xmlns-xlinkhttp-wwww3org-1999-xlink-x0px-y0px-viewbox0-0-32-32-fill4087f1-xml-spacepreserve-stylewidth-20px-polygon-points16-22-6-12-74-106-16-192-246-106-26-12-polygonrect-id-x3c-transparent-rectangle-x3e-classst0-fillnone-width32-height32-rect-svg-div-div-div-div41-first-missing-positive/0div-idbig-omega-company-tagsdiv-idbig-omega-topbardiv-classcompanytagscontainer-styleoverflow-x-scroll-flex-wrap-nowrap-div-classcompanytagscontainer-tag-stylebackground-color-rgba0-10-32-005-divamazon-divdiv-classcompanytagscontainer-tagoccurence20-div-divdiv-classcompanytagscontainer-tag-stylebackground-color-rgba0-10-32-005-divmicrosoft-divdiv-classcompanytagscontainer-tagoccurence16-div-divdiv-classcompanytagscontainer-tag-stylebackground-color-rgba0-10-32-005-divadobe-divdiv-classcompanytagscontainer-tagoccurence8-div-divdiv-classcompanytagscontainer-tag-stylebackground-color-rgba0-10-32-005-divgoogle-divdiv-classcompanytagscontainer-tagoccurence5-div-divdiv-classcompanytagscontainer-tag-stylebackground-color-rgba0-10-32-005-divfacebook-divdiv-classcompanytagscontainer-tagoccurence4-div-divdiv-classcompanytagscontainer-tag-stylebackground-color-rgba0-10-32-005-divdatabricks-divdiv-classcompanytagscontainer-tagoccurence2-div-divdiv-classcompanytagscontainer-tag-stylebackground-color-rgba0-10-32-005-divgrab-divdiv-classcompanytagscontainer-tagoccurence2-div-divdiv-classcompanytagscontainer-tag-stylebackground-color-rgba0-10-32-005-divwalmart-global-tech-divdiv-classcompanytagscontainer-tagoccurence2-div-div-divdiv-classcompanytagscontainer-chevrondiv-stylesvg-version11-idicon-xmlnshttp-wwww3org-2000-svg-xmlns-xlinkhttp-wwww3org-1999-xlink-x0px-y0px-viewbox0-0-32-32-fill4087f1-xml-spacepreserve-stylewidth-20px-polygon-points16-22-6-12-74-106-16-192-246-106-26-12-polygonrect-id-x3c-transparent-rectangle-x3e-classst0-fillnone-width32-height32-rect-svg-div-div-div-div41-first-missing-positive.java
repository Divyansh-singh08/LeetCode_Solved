class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int i = 0;
        //this will sort
        while(i < nums.length){
            int cInd = nums[i]-1;
            //check it ->ignore negative number
            if((nums[i] > 0) && (nums[i] <= nums.length) && (nums[i] != nums[cInd])){
                int temp = nums[i];
                nums[i] = nums[cInd];
                nums[cInd] = temp;
            }else{
                i++;
            }
        }
        
        //find the missing element
        for(int k = 0; k<nums.length; k++){
            if(nums[k] != k+1){
                return k+1;
            }
        }
        
        return nums.length + 1;
    }
}