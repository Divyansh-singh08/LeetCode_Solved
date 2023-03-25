class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mx = nums[0];
        int mi = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            mi = Math.min(mi,nums[i]);
            mx = Math.max(mx,nums[i]);
        }
        
        mi = (mx-k) - (mi+k);
        return mi<0?0:mi;
        
    }
}



