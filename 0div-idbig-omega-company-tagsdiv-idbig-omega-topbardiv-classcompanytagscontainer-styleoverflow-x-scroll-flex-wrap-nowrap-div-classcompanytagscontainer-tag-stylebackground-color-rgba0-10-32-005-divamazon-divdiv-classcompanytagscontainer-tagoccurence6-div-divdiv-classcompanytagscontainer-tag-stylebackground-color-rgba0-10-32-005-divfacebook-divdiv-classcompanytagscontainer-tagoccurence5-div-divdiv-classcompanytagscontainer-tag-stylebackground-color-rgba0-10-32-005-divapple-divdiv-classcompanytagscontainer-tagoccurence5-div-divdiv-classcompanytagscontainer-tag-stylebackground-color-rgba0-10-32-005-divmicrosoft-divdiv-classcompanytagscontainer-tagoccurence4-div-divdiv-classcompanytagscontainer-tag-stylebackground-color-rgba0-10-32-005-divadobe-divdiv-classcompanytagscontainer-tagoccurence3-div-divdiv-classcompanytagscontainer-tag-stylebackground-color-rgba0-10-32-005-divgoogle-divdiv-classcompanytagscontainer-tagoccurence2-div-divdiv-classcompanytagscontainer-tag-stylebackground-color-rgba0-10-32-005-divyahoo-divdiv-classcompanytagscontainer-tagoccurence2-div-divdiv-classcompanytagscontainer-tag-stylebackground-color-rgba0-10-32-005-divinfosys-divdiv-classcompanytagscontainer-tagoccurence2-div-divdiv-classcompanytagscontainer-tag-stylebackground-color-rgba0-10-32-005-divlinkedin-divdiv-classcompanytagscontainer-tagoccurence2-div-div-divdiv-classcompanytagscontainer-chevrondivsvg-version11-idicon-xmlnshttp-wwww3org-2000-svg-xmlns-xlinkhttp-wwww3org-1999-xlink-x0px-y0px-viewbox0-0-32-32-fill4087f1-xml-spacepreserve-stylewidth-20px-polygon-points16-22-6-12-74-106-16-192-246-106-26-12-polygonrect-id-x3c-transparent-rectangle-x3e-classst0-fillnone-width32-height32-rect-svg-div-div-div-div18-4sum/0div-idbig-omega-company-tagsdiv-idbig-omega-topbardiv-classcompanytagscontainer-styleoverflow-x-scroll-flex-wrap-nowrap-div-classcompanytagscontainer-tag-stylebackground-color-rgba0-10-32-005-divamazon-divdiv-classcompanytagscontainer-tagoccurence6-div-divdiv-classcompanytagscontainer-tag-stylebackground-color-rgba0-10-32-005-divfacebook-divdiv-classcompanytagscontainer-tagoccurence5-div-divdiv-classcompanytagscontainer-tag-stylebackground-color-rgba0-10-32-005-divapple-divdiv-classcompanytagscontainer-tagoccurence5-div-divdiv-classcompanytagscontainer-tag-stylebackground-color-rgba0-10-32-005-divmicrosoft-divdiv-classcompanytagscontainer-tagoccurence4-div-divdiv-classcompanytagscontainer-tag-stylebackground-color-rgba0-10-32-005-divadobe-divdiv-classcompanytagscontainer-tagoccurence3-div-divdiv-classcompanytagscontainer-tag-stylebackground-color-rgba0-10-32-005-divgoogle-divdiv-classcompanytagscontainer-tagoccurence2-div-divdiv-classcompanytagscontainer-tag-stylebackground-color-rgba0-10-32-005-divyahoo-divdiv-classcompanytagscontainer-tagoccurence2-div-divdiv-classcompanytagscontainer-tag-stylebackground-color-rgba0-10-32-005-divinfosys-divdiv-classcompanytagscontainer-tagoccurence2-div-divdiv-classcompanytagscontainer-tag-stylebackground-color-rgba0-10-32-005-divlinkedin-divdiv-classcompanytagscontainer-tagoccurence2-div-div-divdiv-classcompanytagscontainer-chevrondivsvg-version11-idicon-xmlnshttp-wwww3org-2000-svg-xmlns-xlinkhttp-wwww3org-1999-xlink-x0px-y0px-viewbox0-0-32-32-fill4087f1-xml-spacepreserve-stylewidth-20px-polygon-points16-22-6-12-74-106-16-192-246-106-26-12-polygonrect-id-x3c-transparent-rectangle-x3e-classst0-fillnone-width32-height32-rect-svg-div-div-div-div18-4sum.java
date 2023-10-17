class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        
        
        //making the list of list to store
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        if(nums.length < 4){
            return ans;
        }
          
        for(int i = 0; i <=n-4; i++){
            
            for(int j = i+1; j <=n-3; j++){
                int k = j+1;
                int l = n-1;
                while(k < l){
                    long value = (long)nums[i] + (long)nums[j] + (long)nums[k]+ (long)nums[l];
                    //check the condition
                    if(value <= target){
                        
                        if(value == target){
                            List<Integer> check = new ArrayList<>();
                            check.add(nums[i]);
                            check.add(nums[j]);
                            check.add(nums[k]);
                            check.add(nums[l]);
                            list.add(check);
                            
                        }
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        
        
        for(List<Integer> it : list){
            ans.add(it);
        }
        
        return ans;
        
        
        
    }
}