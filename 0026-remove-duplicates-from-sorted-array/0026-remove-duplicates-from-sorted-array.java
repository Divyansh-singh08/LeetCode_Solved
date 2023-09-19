class Solution {
    public int removeDuplicates(int[] nums) {
       
        //optimal Approch 
        //two pointer
        //1,1,2
        int iPointer1  = 0;
        for(int jPointer2 = 1; jPointer2<nums.length; jPointer2++){
                
            //check it...
            if(nums[jPointer2] != nums[iPointer1]){
                //just place the correct position
                nums[iPointer1 + 1] = nums[jPointer2];
                iPointer1++;
            }
        }
        
        return (iPointer1+1);
        
        
        
        
        //create set for storing unique element
        //TC-O(N log N) SC- O(N)
//         TreeSet<Integer> uniq = new TreeSet<>();
//         for(int i = 0; i<nums.length; i++){
//             uniq.add(nums[i]);
//         }
        
//         int index = 0;
//         for(int st : uniq){
//             nums[index] = st;
//             index++;
//         }
        
//         return index;
    
    }
}