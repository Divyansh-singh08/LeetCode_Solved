class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i < nums.length){
                int cIndex = nums[i] - 1;
                if(nums[i] != nums[cIndex]){
                    //swap it
                    int temp = nums[i];
                    nums[i] = nums[cIndex];
                    nums[cIndex] = temp;
                }else{
                    i++;
                }
        }
        
        for(int k = 0; k<nums.length; k++){
            if(nums[k] != (k+1)){
                list.add(nums[k]);
            }
        }
        
        return list;
        
    }
}