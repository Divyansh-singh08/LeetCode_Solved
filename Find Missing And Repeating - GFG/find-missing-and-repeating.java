//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        
        //Make Better Approch to solve this...
        int mis = -1,dup = -1;
        int[] hash = new int[n+1];
        
        for(int i = 0; i<n; i++){
            hash[arr[i]]++; 
        }
        int i=1;
        while(i <n+1){
            //there is three condition
            if(hash[i] == 2){
               dup = i; 
            }else if(hash[i] == 0){
                mis = i;
            }
            
            i++;
        }
        
        return new int[]{dup,mis};
        
        
        
        
        //this Brute Froce Approch....
        
        // int mis = -1, dup = -1;
        
        
        // for(int i = 1; i<=n; i++){
        //     int count = 0;
        //     for(int j = 0; j<n; j++){
        //         if(arr[j] == i){
        //             count++;
        //         }
        //     }
        //     if(count == 2){
        //         dup = i;
        //     }else if(count == 0){
        //         mis = i;
        //     }
            
        //     if(mis != -1 && dup != -1){
        //         break;
        //     }
        // }
        
        // return new int[]{dup,mis};
        
    }
}