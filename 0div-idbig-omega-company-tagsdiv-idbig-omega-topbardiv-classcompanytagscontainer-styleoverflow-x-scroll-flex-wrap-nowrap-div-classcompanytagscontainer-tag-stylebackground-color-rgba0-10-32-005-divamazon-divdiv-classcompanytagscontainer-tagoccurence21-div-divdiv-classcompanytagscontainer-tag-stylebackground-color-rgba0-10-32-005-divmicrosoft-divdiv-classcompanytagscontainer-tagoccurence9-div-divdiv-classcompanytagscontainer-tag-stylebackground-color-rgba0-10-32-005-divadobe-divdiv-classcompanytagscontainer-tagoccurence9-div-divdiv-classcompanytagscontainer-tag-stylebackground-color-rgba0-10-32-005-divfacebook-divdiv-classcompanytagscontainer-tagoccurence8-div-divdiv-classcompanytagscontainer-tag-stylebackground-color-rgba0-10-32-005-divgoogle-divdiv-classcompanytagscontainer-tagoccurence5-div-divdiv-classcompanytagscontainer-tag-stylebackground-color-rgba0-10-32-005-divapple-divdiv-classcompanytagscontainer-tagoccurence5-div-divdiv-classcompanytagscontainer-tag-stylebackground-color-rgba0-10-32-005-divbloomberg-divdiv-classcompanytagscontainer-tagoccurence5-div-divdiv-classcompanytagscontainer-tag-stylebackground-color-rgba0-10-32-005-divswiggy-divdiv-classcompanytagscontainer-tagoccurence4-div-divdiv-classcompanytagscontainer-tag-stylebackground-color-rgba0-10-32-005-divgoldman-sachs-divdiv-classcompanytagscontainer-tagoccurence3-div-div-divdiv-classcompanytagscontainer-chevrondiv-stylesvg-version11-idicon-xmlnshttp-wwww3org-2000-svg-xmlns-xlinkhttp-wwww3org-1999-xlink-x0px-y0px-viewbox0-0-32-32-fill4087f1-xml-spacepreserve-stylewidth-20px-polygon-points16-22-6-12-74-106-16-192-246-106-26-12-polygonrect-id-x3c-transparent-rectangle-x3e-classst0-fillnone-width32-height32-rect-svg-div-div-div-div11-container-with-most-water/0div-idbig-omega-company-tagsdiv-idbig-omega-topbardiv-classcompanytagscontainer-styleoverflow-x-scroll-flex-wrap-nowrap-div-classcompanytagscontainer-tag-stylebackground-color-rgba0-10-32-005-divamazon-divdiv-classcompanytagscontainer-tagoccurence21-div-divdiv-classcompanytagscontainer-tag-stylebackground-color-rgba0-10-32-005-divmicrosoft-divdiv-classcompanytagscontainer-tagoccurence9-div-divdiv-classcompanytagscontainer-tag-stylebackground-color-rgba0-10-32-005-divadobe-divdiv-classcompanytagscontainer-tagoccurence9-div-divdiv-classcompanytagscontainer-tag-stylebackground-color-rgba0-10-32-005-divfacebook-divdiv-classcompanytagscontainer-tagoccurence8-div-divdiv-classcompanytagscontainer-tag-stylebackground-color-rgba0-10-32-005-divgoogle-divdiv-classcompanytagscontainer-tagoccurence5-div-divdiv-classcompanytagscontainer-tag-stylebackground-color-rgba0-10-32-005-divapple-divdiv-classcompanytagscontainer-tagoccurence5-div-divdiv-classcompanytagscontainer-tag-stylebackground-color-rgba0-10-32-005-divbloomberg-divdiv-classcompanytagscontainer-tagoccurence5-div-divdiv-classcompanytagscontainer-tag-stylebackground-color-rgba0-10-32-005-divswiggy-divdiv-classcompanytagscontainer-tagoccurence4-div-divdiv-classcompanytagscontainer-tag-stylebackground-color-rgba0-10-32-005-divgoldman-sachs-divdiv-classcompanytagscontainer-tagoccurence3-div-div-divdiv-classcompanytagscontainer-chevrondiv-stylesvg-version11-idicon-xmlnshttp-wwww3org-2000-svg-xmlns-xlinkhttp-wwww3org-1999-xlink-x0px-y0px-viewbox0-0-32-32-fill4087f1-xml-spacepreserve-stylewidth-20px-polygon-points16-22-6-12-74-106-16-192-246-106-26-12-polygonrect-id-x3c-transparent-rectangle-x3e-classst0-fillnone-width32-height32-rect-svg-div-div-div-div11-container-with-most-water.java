class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        
        int l = 0;//starting pointer
        int r = n-1;//end pointer
        int max = 0;
        while(l < r){
            int lh = height[l];//stating pointer piller value
            int rh = height[r];//end pointer piller value
            int minElement = Math.min(lh,rh);//min piller btw them
            
            //max water container capacity
            max = Math.max(max,(minElement * (r-l)));
            //check if left side is samller value compair to right
            //then left pointer increase
            if(lh < rh){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}