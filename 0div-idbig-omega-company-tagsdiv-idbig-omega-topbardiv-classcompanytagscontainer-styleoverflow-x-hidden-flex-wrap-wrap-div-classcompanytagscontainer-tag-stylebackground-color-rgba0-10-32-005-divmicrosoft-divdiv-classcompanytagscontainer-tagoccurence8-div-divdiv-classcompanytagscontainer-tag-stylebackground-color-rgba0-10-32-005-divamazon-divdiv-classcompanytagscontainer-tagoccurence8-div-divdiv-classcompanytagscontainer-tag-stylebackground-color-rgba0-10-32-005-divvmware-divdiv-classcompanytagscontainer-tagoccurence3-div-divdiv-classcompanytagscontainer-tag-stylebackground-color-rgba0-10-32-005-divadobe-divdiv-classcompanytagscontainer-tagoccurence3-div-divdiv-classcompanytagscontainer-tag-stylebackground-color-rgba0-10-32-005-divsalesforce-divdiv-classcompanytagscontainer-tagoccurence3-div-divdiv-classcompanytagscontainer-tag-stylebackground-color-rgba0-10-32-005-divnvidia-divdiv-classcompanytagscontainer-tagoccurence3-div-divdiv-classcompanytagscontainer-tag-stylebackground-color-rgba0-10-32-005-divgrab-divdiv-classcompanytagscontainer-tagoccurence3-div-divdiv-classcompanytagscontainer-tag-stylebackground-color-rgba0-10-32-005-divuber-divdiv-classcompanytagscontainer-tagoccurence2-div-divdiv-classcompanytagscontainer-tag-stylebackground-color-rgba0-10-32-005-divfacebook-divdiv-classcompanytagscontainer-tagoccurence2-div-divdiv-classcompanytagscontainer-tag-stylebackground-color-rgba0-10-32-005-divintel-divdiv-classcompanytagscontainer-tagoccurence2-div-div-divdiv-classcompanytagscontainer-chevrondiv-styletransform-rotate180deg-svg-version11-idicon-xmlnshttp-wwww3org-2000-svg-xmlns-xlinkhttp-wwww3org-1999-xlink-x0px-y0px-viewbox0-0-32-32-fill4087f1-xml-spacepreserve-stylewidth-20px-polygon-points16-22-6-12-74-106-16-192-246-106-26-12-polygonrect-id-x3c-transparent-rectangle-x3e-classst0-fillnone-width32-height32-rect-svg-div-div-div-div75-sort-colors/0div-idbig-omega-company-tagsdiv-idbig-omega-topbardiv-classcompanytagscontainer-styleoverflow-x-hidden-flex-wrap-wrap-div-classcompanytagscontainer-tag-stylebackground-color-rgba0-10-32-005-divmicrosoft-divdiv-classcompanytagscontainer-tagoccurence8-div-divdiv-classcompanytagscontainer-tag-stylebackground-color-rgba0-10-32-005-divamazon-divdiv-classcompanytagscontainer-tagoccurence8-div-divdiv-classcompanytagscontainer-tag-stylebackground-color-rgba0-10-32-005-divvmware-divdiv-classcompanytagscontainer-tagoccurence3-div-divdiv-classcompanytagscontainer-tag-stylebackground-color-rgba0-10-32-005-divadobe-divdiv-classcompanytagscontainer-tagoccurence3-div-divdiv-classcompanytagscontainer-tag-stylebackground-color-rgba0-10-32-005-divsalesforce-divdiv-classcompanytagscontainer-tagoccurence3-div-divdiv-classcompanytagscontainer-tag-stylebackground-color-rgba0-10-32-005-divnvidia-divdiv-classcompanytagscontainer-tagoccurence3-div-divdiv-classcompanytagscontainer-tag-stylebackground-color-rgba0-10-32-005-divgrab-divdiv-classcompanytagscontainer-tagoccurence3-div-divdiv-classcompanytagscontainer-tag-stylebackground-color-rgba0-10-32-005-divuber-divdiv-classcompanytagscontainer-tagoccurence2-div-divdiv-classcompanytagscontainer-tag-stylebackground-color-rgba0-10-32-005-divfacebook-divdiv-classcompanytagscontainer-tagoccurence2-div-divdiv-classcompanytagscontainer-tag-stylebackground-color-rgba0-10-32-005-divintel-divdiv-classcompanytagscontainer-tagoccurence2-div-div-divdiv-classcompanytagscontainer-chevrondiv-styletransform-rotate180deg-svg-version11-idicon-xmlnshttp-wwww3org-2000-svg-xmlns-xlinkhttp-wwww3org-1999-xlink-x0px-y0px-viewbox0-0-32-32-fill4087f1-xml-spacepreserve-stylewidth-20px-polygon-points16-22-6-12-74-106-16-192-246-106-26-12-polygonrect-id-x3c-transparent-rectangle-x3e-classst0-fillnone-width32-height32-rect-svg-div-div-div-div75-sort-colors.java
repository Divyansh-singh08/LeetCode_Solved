class Solution {
    public void sortColors(int[] nums) {
        
        //1st Method
        // Arrays.sort(nums);
        
        //2nd Method
        //using BS algo
        //using 3 pointer
        //bcz here we only get 3 value
        int low = 0;
        int mid = 0;
        int heigh = nums.length-1;
        while(mid <= heigh){
            if(nums[mid] == 0){
                //swap
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[heigh];
                nums[heigh] = temp;
                heigh--;
            }
        }
        
        
        
//         int n = nums.length;
//         int low = 0;
//         int mid = 0;
//         int heigh = n - 1;

//         // for iteration use while loop
//         while(mid <= heigh){
//             //condition check
//             if(nums[mid] == 0){
//                 //swap
//                 int temp = nums[mid];
//                 nums[mid] = nums[low];
//                 nums[low] = temp;
//                 low++;
//                 mid++;
//             }else if(nums[mid] == 1){
//                 mid++;
//             }else{
//                 int temp = nums[mid];
//                 nums[mid] = nums[heigh];
//                 nums[heigh] = temp;
//                 heigh--;
//             }
//         }
    }
}