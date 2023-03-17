class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int minE = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(minE > nums[i]){
                minE = nums[i];
            }
        }
        return minE;
    }
}