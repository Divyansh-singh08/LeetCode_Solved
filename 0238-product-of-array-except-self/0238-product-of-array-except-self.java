class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] out = new int[n];
        if(n == 0){
            return out;
        }
        int prod = 1;
        for(int i=0;i<n;i++){
            out[i] = prod;
            prod *=nums[i];
        }
        int prod1 = 1;
        for(int i = n-1; i >=0; i--){
            out[i] *= prod1;
            prod1 *=nums[i];
            
        }
        return out;
        
        
    }
}


    // int[] ret = new int[leng];
    // if(leng == 0)
    //     return ret;
    // int runningprefix = 1;
    // for(int i = 0; i < leng; i++){
    //     ret[i] = runningprefix;
    //     runningprefix*= nums[i];
    // }
    // int runningsufix = 1;
    // for(int i = leng -1; i >= 0; i--){
    //     ret[i] *= runningsufix;
    //     runningsufix *= nums[i];
    // }
    // return ret;