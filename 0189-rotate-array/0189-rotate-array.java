class Solution {
    

    
    public static void reverse(int[] nums,int l,int r){
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    
    }
    
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length-1;
        reverse(nums,0,n-k);
        reverse(nums,n-k+1,n);
        reverse(nums,0,n);
        
    }
}


// public void rotate(int[] nums, int k) {
//     k %= nums.length;
//     reverse(nums, 0, nums.length - 1);
//     reverse(nums, 0, k - 1);
//     reverse(nums, k, nums.length - 1);
// }

// public void reverse(int[] nums, int start, int end) {
//     while (start < end) {
//         int temp = nums[start];
//         nums[start] = nums[end];
//         nums[end] = temp;
//         start++;
//         end--;
//     }
// }