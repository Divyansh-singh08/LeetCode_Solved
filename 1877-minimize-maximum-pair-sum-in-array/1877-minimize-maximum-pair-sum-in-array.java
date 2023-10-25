class Solution {
    public int minPairSum(int[] nums) {
        
        int n = nums.length;
        if(n%2 != 0){
            return -1;
        }
        int maxAns = Integer.MIN_VALUE;
        int left = 0;
        int right = n-1;
        Arrays.sort(nums);
        while(left < right){
            
            maxAns = Math.max(maxAns,nums[left]+nums[right]);
            left++;
            right--;
        }
        
        return maxAns;
        
    }
}