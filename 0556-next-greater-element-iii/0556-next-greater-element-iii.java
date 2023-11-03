class Solution {
//     public int nextGreaterElement(int n) {
        
//     }
    
     public int nextGreaterElement(int n) {
        //Converting integer to an array of digits
        String s = Integer.toString(n);
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i) - '0';
        }
        
        //Finding the first decreasing element(i-1) from behind
        int i = arr.length - 1;
        while(i > 0 && arr[i-1] >= arr[i]){
            i--;
        }
        //If no element is decreasing and the array is all increasing from behind then return -1 as no solution possible
        if(i-1 < 0) return -1;
        
        //Finding the next bigger element(j) than (i-1) from behind
        int j = arr.length-1;
        while(j > (i-1) && arr[j] <= arr[i-1]){
            j--;
        }
        
        //Swap the elements
        swap(arr, i-1, j);
        //Reverse the array from i to end
        reverse(arr, i);
        
        //Convert the array to an integer but make sure to check that if does not exceed the 32 bit integer as mentioned in the question
        int ans = 0;
        for(i=0;i<arr.length;i++){
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && arr[i] > 7))
                return -1;
            if(ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && arr[i] < -8))
                return -1;
            ans = ans * 10 + arr[i];
        }
        //If the same integer is formed then return -1
        return ans == n ? -1 : ans;
    }
    
    //Helper function to reverse
    private void reverse(int[] arr, int i){
        int j = arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    //Helper function to swap the elements
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}