class Solution {
    public int missingNumber(int[] nums) {
        
        
        //one more approch
        //cyclic approch
        int i = 0;
        while(i < nums.length){
            int currIndex = nums[i];  
            //check
            if((nums[i] < nums.length) && (nums[i] != nums[currIndex])){
                
                int temp = nums[i];
                nums[i] = nums[currIndex];
                nums[currIndex] = temp;                
            }else{
                i++;
            }
        }
        
        //search for elment
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
        
        
        
//         //brute force approch
//         int ans = 0;O(N^2)
//         for(int i = 1; i<=nums.length; i++){
            
//             int flag = 0;
//             for(int j = 0; j<nums.length; j++){
//                 if(nums[j] == i){
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag == 0){
//                 ans = i;
//             }
//         }
//         return  ans;
        
        
        //this is the best Optimal O(N)
//         int sum = 0; 
//         int n = nums.length;
//         int mis = (n*(n+1))/2;
//         for(int i = 0; i<n; i++){
//             sum = sum + nums[i];
//         }
        
//         return (mis-sum);
        
        
        //THIS HAVE ONE MORE OPTIMAL APPROCH XOR
//         int xor1 = 0;
//         int xor2 = 0;
//         int n = nums.length-1;
//         for(int i = 0; i<n; i++){
//             xor2 = xor2 ^ nums[i];
//             xor1 = xor1 ^ (i+1);

            
//         }
//         xor1 = xor1 ^ nums.length;
//         return xor1 ^ xor2;
        
        
//         int xor = 0, i = 0;
// 	    for (i = 0; i < nums.length; i++) {
// 		    xor = xor ^ i ^ nums[i];
// 	    }

// 	    return xor ^ i;
        
    }
}