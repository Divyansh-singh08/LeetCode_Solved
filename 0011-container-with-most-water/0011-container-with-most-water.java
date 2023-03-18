class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
        //water container
        int water = 0;
        int i = 0;
        int j = n-1;//two pointer to manage index
        while(i<j){
            
            int width = (j-i);
            water = Math.max(water,Math.min(height[i],height[j]) * width);
            
            if(height[i] < height[j]){
                // int width = (j-i);
                // water = Math.max(water,Math.min(height[i],height[j]) * width);
                i++;
            }else{
                // int width = (j-i);
                // water = Math.max(water,Math.min(height[i],height[j]) * width);
                j--;
            }
            
        }
        return water;
        
        
        
    }
}