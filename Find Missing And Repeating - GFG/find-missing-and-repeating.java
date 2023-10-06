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
    int[] findTwoElement(int arr[], int N) {
        // code here
        //maing Optimal Approch O(N) time
        //here we basically using Sum technique
        long n = (long)N;
        
        int dup = -1,mis = -1;
        
        //sum of all element till the range 1 to N
        long Nsum = (n * (n+1))/2; //21
        //SquareSum of all element till the range 1 to N
        long NsumSquare = (n * (n+1) * (2*n+1))/6;   
        
        long sum = 0;
        long SquareSum = 0;
        
        //sum of all the array elements 0 to N-1
        //square Sum of all array element 0 to N-1
        for(int i = 0; i<n; i++){
            sum += arr[i]; //17
            SquareSum += (long)arr[i] * (long)arr[i];
        }
        
             
        //this is the first Equation
        long ans1 = sum - Nsum; //-4
        //this is the second Equation
        long ans2 = SquareSum - NsumSquare; //-24
        
        // int mainResult = ans2 /ans1;
        //actually be are upadting ans2 -24 to ----> 6
        //ans2 = 6 
        ans2 /= ans1;
        
        //as we know ans2 = 1 
        //-4 + 6 = 2/2 = ** 1 **
        long ans3Dup =(ans1 + ans2)/2;
        
        // 6 - 1 = 5 -> missing element
        long ans3mis = ans2 - ans3Dup;
        
        //you get the duplicate element
        dup = (int)ans3Dup;
        //missing element
        mis = (int)ans3mis;
        
        return new int[]{dup,mis};
        
        
        
        
        
        
        
        
        
        
        
        
        //Make Better Approch to solve this...
        // int mis = -1,dup = -1;
        // int[] hash = new int[n+1];
        
        // for(int i = 0; i<n; i++){
        //     hash[arr[i]]++; 
        // }
        
        // int i=1;
        // while(i <= n){
        //     //there is three condition
        //     if(hash[i] == 2){
        //       dup = i; 
        //     }else if(hash[i] == 0){
        //         mis = i;
        //     }
        //     //edge case must follow
        //     if(dup != -1 && mis != -1){
        //         break;
        //     }
        //     i++;
        // }
        
        // return new int[]{dup,mis};
        
        
        
        
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