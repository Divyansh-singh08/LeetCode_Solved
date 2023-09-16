class Solution {
    public static int primeF(int f){
        int ans = 0;
        for(int i = 2; i < f; i++){
            
            while(f%i == 0){
                f = f /i;
                ans = ans + i;
            }
        }
        if( f != 1){
            ans = ans + f;
        }
        return ans;
    }
    
    public int smallestValue(int n) {
        
        while(true){
            
            int sum = primeF(n);
            
            if(sum == n){
                break;
            }
             n = sum;
        }
        return n;
    }
}