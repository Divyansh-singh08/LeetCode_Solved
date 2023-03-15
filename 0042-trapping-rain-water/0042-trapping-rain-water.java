class Solution {
    public int trap(int[] height) {
        //brute force aproch
//         int n = height.length;
//         int water = 0;
//         int[] left =new int[n];
//         int[] right=new int[n];
//         left[0]= height[0];
        
//         for(int i=1; i <n; i++){
//            if(height[i] > left[i-1]){
//                left[i] = height[i];
//            }else{
//                left[i] = left[i-1];
//            }
//         }
//         for(int j = n-2; j>=0; j--){
//                 if(height[j] > right[j+1]){
//                     right[j] = height[j];
//                 }else{
//                     right[j] = right[j+1];
//                 }
//         }
//         for(int i=1;i<n-1;i++){
//             water+=Math.min(left[i],right[i])-height[i];
//         }
//         return water;
        
        
        //optimal approch
        
        
        int n = height.length;
        int l = 0;
        int r = n-1;
        int rmax = 0;
        int lmax = 0;
        int water = 0;
        
        //need iteration
        //usinig two pointer approch
        while(l<=r){
            
            if(height[l]<=height[r]){
            //this will handle the left part
                if(height[l] > lmax){
                    lmax = height[l];
                }else{
                    water+=lmax-height[l];
                }
                l++;
            }else{
                if(height[r] > rmax){
                    rmax = height[r];
                }else{
                    water+=rmax - height[r];
                }
                r--;
            }
        }
        return water;
        
    }
}