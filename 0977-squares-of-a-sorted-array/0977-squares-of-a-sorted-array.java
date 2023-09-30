class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        
        //iterate multiple them in array
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        
        int iPointer = 0;
        int jPointer = nums.length-1;
        int kPointer = arr.length-1;
        while(iPointer <= jPointer){
            
            //compair
            if(nums[iPointer] > nums[jPointer]){
                
                arr[kPointer] = nums[iPointer];
                iPointer++;
                kPointer--;
            }else{
                arr[kPointer] = nums[jPointer];
                jPointer--;
                kPointer--;
            }
        }
        return arr;
    }
}