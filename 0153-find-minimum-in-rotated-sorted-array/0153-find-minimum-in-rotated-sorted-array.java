class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        // int minE = Integer.MAX_VALUE;
        // for(int i = 0; i < n; i++){
        //     if(minE > nums[i]){
        //         minE = nums[i];
        //     }
        // }
        // return minE;
        
        //optimal approch using Binary search algo
        int l = 0;
        int r = n-1;
        // int m = (l+r)/2;
        while(l<r){
             int m = (l+r)/2;
            if(nums[m]<nums[r]){
                r = m;
            }else{
                l = m+1;
            }
        }
        return nums[l];
    }
}