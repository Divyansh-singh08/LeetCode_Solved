class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //3Pointer technique we used here in O(N^2)
        
        Set<List<Integer>> res = new HashSet<>();//this is for storing the unique list
        
        if(nums.length == 0){
            return new ArrayList<>(res);
        }
        //do first storting for 3 tecnique
        Arrays.sort(nums);
        
        //for makeing one fixed Pointer we use 2 loop
        for(int i = 0; i < nums.length - 2 ;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k ){
                int sum = nums[j]+nums[k];
                if(sum == -nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum > -nums[i]){
                    k--;//sum more then decrease
                }else if(sum < -nums[i]){
                    j++;//sum less then do increase
                }
            } 
        }
        return new ArrayList<>(res);
        
    }
}