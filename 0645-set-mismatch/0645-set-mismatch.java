class Solution {
    public int[] findErrorNums(int[] nums) {
//         int[] arr;
//         int i = 0;
//         //sort the array
//         while(i < nums.length){
//             int currIndex = nums[i] - 1;
//             if(nums[i] != nums[currIndex]){
//                 int temp = nums[i];
//                 nums[i] = nums[currIndex];
//                 nums[currIndex] = temp;
//             }else{
//                 i++;
//             }
//         }
        
//         //find the missing element and repeated element
//         for(int l = 0; l < nums.length; l++){
//             if(nums[l] != l+1){
//                 return new int[] {nums[l],l+1};
                
//             }
//         }
        
//         return new int[] {-1,-1};
        // [1 2 2 4]
        
        long n = (long)nums.length;
        int[] arr;
        //sum of all elemen 1 to N
        long sumofElementIn1toN = (n*(n+1))/2; //10
        //sum of all Square Element 1 to N
        long sumofSqureElementIn1toN = (n*(n+1)*(2*n+1))/6; //30
        
        long sumofArrayN = 0;
        long sumofArraySqN = 0;
        //find sum of all element in the array
        // and also find sum of all Square element in the array
        for(int i = 0; i < n; i++){
            sumofArrayN += nums[i]; // 9
            sumofArraySqN += (long)nums[i] * (long)nums[i]; // 25
        }
        
        //Make first equation
        // (1+2+2+4) - (1+2+3+4) = 2 - 3 = -1
        long firstEquation = sumofArrayN - sumofElementIn1toN;
        
        //Make a second Question 
        // (1^2 + 2^2 + 2^2 + 4^2) - (1^2 + 2^2 + 3^2 + 4^2 ) = 4 - 9 = -5
        long secondEquation = sumofArraySqN - sumofSqureElementIn1toN;
        
        //now update the 2nd Equation
        secondEquation  /= firstEquation; //update as -5/-1 => 5
        
        //now make play with equations as we do in class 10
        
        //repatitive number
        long repetitiveNumber = (secondEquation + firstEquation)/2;
        
        //again put one value to other get missing element
        long missing = secondEquation - repetitiveNumber;
        
        return new int[]{(int)repetitiveNumber,(int)missing};        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}