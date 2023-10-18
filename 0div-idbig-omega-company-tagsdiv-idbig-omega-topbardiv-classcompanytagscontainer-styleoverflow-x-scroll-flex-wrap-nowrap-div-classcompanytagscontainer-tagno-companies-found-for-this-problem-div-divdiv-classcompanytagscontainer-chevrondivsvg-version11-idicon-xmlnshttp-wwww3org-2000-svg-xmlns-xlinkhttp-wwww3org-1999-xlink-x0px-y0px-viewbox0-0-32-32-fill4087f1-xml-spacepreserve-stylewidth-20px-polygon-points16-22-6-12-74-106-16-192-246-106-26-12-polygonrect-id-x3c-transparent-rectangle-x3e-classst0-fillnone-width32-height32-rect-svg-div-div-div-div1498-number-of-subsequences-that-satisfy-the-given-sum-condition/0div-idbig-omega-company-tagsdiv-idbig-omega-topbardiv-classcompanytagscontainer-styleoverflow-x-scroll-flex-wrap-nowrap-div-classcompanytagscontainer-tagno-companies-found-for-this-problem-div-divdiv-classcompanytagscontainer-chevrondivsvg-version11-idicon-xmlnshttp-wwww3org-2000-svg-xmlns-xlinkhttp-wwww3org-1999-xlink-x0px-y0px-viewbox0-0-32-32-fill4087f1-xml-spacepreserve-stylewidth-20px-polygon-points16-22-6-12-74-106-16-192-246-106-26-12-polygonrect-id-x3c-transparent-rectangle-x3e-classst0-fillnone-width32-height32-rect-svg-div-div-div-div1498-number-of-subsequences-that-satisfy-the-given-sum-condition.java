class Solution {   
    
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007;
        int ans = 0;
        int i = 0;
        int j = nums.length-1;
        List<Integer> pow = new ArrayList<>();
        pow.add(1);
        for(int ii = 1; ii<=j; ii++){
            pow.add(((pow.get(ii-1)%mod ) * 2) % mod);
        }
        Arrays.sort(nums);
        
        while(i <= j){
            
            if(nums[i] + nums[j] > target){
                j--;
            }else{
                ans = (int)((ans + (pow.get(j-i)%mod))%mod);
                i++;
            }
        }
        
        return ans;
    }
}