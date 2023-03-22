class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int heigh = n - 1;

        // for iteration use while loop
        while(mid <= heigh){
            //condition check
            if(nums[mid] == 0){
                //swap
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[heigh];
                nums[heigh] = temp;
                heigh--;
            }
        }
    }
}