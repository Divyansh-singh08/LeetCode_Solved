//{ Driver Code Starts
//Initial Template for Java



import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
       
       
    //Most Optimal Solution
    int fLar = arr[0];
    int sLar = -1;
    
    for(int i = 1; i<n; i++){
        
        if(arr[i] > fLar ){
            sLar = fLar;
            fLar = arr[i];
        }
        else if(arr[i] < fLar && arr[i] > sLar){
            sLar = arr[i];
        }
    }
    
    return sLar;
    
       
       
       
       
    //      //optimal way
    // int Fmax = arr[0];
    // int Smax = -1;
    // for(int i = 0; i<n; i++){
    //     if(arr[i] > Fmax){
    //         Fmax = arr[i];
    //     }
    // }
    // for(int i = 0; i<n; i++){
    //       if(arr[i] > Smax && arr[i] < Fmax){
    //         Smax = arr[i];
    //     }
    // }
    // return Smax;
       
       
       
       
       
       
       
       
        // code here
       
       
       
       
    //   //brute force
    //   // O(N log n)
    //   Arrays.sort(arr);
    //   int lar = arr[n-1];
    //   int se = -1;
    //   for(int i=n-2; i>=0; i--){
    //       if(arr[i] != lar ){
    //           se = arr[i];
    //           break;
    //       }
    //   }
    //   return se;
    
  
    
    
    
    }
}