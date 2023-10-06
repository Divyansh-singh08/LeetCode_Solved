class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr;
        int i = 0;
        //sort the array
        while(i < nums.length){
            int currIndex = nums[i] - 1;
            if(nums[i] != nums[currIndex]){
                int temp = nums[i];
                nums[i] = nums[currIndex];
                nums[currIndex] = temp;
            }else{
                i++;
            }
        }
        
        //find the missing element and repeated element
        for(int l = 0; l < nums.length; l++){
            if(nums[l] != l+1){
                return new int[] {nums[l],l+1};
                
            }
        }
        
        return new int[] {-1,-1};
        
    }
}