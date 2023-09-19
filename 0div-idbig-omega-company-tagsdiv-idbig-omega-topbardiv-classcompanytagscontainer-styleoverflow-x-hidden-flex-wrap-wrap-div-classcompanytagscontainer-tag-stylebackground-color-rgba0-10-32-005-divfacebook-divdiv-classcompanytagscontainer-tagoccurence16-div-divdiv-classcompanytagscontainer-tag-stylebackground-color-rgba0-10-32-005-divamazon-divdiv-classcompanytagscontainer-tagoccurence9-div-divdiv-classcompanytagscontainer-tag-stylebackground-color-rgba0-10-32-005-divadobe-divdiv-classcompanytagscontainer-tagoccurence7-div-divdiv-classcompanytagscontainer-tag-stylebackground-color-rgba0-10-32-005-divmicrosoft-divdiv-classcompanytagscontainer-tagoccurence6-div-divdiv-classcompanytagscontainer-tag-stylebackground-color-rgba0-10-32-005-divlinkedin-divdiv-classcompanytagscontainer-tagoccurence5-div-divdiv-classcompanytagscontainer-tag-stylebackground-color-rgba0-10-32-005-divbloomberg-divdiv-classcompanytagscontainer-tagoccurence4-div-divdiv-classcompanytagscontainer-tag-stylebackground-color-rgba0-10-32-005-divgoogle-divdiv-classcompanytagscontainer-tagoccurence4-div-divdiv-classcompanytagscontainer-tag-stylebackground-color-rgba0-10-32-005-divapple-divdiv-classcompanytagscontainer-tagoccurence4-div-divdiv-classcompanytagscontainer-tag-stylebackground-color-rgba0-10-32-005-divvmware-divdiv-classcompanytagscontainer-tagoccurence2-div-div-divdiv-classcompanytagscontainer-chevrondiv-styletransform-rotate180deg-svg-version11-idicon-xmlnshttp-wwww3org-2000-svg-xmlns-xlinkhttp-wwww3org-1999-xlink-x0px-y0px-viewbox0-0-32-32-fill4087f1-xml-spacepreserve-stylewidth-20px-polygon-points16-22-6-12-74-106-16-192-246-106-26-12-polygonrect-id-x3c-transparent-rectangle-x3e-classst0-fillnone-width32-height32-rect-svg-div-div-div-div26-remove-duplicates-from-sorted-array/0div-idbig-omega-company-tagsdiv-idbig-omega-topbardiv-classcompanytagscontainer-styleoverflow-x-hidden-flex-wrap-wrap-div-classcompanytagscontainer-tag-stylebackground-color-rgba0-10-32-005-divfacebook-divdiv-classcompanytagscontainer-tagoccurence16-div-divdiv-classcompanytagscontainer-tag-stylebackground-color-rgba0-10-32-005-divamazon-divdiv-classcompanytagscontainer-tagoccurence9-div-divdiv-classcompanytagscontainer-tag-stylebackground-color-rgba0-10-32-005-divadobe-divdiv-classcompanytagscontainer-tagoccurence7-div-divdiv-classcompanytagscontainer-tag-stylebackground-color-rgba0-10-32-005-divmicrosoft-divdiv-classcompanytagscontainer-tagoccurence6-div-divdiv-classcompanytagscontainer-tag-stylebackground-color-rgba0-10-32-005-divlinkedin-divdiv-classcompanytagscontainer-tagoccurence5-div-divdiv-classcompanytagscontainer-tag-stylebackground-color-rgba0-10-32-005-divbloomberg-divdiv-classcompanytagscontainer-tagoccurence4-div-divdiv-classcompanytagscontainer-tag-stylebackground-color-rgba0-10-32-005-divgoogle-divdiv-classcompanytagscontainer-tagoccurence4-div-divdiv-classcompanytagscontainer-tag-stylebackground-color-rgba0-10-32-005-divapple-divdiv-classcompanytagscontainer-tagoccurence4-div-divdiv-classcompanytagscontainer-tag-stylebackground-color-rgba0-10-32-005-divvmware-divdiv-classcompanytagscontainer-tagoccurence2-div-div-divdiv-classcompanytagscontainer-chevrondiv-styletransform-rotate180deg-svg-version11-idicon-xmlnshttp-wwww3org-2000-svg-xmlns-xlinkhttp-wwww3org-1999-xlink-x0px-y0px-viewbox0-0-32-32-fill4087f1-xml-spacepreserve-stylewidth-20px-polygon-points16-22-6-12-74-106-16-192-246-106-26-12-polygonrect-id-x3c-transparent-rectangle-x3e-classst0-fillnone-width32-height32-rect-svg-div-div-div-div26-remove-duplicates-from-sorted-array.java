class Solution {
    public int removeDuplicates(int[] nums) {
       
        //create set for storing unique element
        TreeSet<Integer> uniq = new TreeSet<>();
        for(int i = 0; i<nums.length; i++){
            uniq.add(nums[i]);
        }
        
        int index = 0;
        for(int st : uniq){
            nums[index] = st;
            index++;
        }
        
        return index;
    
    }
}