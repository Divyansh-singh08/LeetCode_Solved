class Solution {
    public int minimumSum(int[] nums) {
        // int n = nums.lengh;
        int min = Integer.MAX_VALUE;
        int[] leftMin = new int[nums.length];
        int[] rightMin = new int[nums.length];
        leftMin[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            leftMin[i] = Math.min(leftMin[i-1],nums[i]);
        }
        rightMin[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            rightMin[i] = Math.min(rightMin[i+1],nums[i]);
        }
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<nums.length-1; i++){
            if(leftMin[i-1]<nums[i] && rightMin[i+1]<nums[i]){
                ans = Math.min(ans,leftMin[i-1]+rightMin[i+1]+nums[i]);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;

        
        
    }
}