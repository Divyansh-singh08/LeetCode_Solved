class Solution {
    
    static int checkIt(int[] arr,int capacity){
        int days = 1;
        int load = 0;
        
        for(int i = 0; i<arr.length; i++){
            
            if(load + arr[i] > capacity){
                days = days + 1;
                load = arr[i];
            }else{
                load = load + arr[i];
            }
        }
        
        return days;
    }
    
    
    public int shipWithinDays(int[] weights, int days) {
        
        
        int l = Integer.MIN_VALUE, h = 0;
        for (int i = 0; i < weights.length; i++) {
            h += weights[i];
            l = Math.max(l, weights[i]);
        }

        
        while(l <= h){
            
            int mid = (l+h)/2;
            
            int noofDays = checkIt(weights,mid);
            if(noofDays <= days){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}