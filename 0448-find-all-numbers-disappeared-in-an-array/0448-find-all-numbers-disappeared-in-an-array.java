class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //cyclic approch
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            
            int cIndex = nums[i] - 1;
            if(nums[i] != nums[cIndex]){
                //if different then swap
                int temp = nums[i];
                nums[i] = nums[cIndex];
                nums[cIndex] = temp;
            }else{
                i++;
            }
        }
        
        for(int k = 0; k < nums.length; k++){
            if(nums[k] != (k+1)){
                int val = k+1;
                list.add(val);
            }
        }
        return list;
    }
}