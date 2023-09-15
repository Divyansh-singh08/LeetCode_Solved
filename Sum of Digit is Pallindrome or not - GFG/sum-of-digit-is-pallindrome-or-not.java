//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public static boolean isPallid(int no){
        boolean check = false;
        
        int newNo = no;
        int val = 0;
        while(no > 0){
            int rem = no%10;
            val = val*10 + rem;
            no = no/10;
        }
        
        if(val == newNo){
            check = true;
        }
        
        return check;
    }
    
    int isDigitSumPalindrome(int N) {
        // code here
        int sum = 0;
        while(N > 0){
            int rem = N%10;
            sum += rem;
            N = N/10;
        }
        
         boolean ans =isPallid(sum);
         if(!ans){
             return 0;
         }
         return 1;
    }
}