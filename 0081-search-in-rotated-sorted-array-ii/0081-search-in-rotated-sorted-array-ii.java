class Solution {
      public boolean search(int[] nums, int target) {
          
          int l = 0;
          int h = nums.length-1;
          
          while(l<=h){
              
              int mid = (l + h)/2;
              //if equal the value required
              if(nums[mid] == target) return true;
              
              //Some IMP Edge Case
              if(nums[l] == nums[mid] && nums[mid] == nums[h]){
                  l++;
                  h--;
                  continue;
              }
             // low  is less then mid
              if( nums[l] <= nums[mid]){
                  //check to the left side
                  if(nums[l] <= target && target <= nums[mid]){
                      h = mid - 1;
                  }else{
                      l = mid + 1;
                  }
        
              }else{
                  //check to the right side
                  if(nums[mid] <= target && target <= nums[h]){
                      l = mid + 1;
                  }else{
                      h = mid - 1;
                  }
                  
              }
              
              
          }
          return false;
    }
    
}