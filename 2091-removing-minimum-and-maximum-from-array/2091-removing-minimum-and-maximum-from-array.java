import java.util.*;
class Solution {
    public int minimumDeletions(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int n = nums.length;
        int indexmin=0;
        int indexmax=0;
        for(int i = 0; i < n; i++){
            //condtion for checking
            if(nums[i] > maxi){
                maxi = nums[i];
                indexmax=i;
            }
            if(nums[i] < mini){
                mini = nums[i];
                indexmin=i;
            }
        }
        
        int numOfDelFromLeft = Math.max(indexmax, indexmin) + 1;
        int numOfDelFromRight = n - Math.min(indexmax, indexmin);
        int numOfDelFromLeftAndRight = (Math.min(indexmax, indexmin) + 1) + (n - Math.max(indexmax, indexmin));
        
        return Math.min(numOfDelFromLeftAndRight , ( Math.min(numOfDelFromLeft, numOfDelFromRight) ));
        
    }
}