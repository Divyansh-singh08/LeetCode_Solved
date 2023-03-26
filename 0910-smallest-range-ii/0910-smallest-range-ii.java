class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = nums[n-1] - nums[0];
        
        int sm = nums[0]+k;
        int lar = nums[n-1]-k;
        int mi,ma;
        for(int i =1; i < n; i++){
            mi = Math.min(sm,nums[i]-k);
            ma = Math.max(lar,nums[i-1]+k);
            res = Math.min(res,ma-mi);
        }
        return res;
    }
}