class Solution {
    public int minPairSum(int[] nums) {
        
        //this is one ways T.C ->O(n log n)
//         int n = nums.length;
//         if(n%2 != 0){
//             return -1;
//         }
//         int maxAns = Integer.MIN_VALUE;
//         int left = 0;
//         int right = n-1;
//         Arrays.sort(nums);
//         while(left < right){
            
//             maxAns = Math.max(maxAns,nums[left]+nums[right]);
//             left++;
//             right--;
//         }
        
//         return maxAns;
        
        
        
        //SPACE COMPLIXITY IS MORE
        //TIME IS O(N) TIME IT TAKE
        
        
        int n = nums.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        
        
        
        int[] arr = new int[max+1];
        //using the hashing technique
        for(int i = 0; i<n; i++){
            arr[nums[i]]+=1;
        }
        
        int temp = 0;
        int i = 0;
        int j = max;
        while(i<=max){
            
            if(arr[i] == 0){
                i++;
                continue;
            }
            
            if(arr[j] == 0){
                j--;
                continue;
            }
            
            
            if(arr[i] !=0 && arr[j] != 0){
                
                if(i+j > temp){
                    temp = i+j;
                }
                arr[i]--;
                arr[j]--;
            }
        }
        
        return temp;
    }
}