class Solution {
    public int search(int[] nums, int target) {
        
//         //O(N) approch is
        for(int i = 0; i <nums.length; i++){
            
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
        
//         //need to do in optimize approch O(log n)
//         //binary search logic applied here
//         int low = 0;
//         int heigh = nums.length-1;
//         while(low<=heigh){
//             int mid = low + (heigh - low)/2;
        
//             if(nums[mid] ==  target) return mid;
            
//             //left side is sort upto the middle
//             if(nums[low] <= nums[mid]){
//                 //figure out if element lie on the left half or not
//                 if(target >= nums[low] && target <= nums[mid]){
//                     heigh = mid - 1;
//                 }else{
//                     low = mid + 1;
//                 }
//                 //right side is sort
//             }else{
//                 if(target >= nums[mid] && target <= nums[heigh]){
//                     low = mid +1;
//                 }else{
//                     heigh = mid-1;
//                 }
//             }
//         }
//         return -1;
        
        
    }
}