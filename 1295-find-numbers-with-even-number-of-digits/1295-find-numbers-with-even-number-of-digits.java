class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            
            int ele = nums[i];
            int c = 0;
            while(ele > 0){
                int rem = ele % 10;
                c++;
                ele = ele /10;
                
            }
            if( c%2 == 0){
                count++;
            }
        }
        return count;
    }
}