//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // const int N = 1e5+10;
    
    // int [] position = new int[N];
    static boolean canPlaceCow(int minDist,int[] stalls,int cows){
        
        int lastPostion = -1;
        for(int i = 0; i < stalls.length; i++){
            
            if((stalls[i] - lastPostion >= minDist) || (lastPostion == -1)){
                cows--;
                lastPostion = stalls[i];
            }
            
            if(cows == 0) break;
        }
        
        if(cows == 0){
            return true;
        }
        return false;
    }
    
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);
        int low = 0;
        int high = 1_000_000_000;
        
        while(low < high){
            int mid = low + (high - low + 1 ) / 2;
            
            ///monotonic functions
            if(canPlaceCow(mid,stalls,k) == true){
                low = mid;
            }else{
                high = mid - 1;
            }
        }
        
        return low;
        
    }
}