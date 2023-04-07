class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = m+n-1, a = m-1, b = n-1; b>=0; i--){
            
            //now checck the condition
            if(a>=0 && nums1[a] > nums2[b]){
                nums1[i] = nums1[a];//put the value there..
                a--;
            }else{
                nums1[i] = nums2[b];//need to place larger value;
                b--;
            }
        }
        
    }
}
