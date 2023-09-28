class Solution {
    public int findDuplicate(int[] nums) {
        
        
        //cyclic sort apply
        int i = 0;
        while(i < nums.length){
            
            if(nums[i] != (i+1)){
                int ind = nums[i] - 1;
                if(nums[i] != nums[ind]){
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind] = temp;
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        
        return -1;
        
        
        //using Binary Search Tree
//         int low = 0;
//         int high = nums.length-1;
//         while(low <= high){
            
//             int mid = (low + high)/2;
//             int count = 0;
//             for(int j : nums){
//                 //condition must be check that
//                 if(j <= mid){
//                     count++;
//                 }
//             }
            
//             //again check the condition
//             if(count <= mid){
//                 low = mid + 1;
//             }else{
//                 high = mid - 1;
//             }
//         }
//         return low;
        
        
//         //TROTOISE approch Using LL cyclic graph
//         int slow = nums[0];//this take one step
//         //fast take 2 step
//         int fast = nums[0];//initial both are sam position
//         do{
//             slow = nums[slow];//this is for single step
//             fast = nums[nums[fast]];//this is for two step
//         }while(slow != fast);
        
//         //when tha while loop break
//         //then again fast will be at initial index
//         fast = nums[0];
//         //now fast and slow both will take single step
//         while(slow != fast){
//             slow = nums[slow];
//             fast = nums[fast];
//         }
//         return fast;
        

    }
}