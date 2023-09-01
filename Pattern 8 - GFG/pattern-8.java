//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
       //not optimal but correct solution
    for (int i = 0; i < n; i++)
    {
        // For printing the spaces before stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       
        // For printing the stars in each row
        for(int j=0;j< 2*n -(2*i +1);j++){
            
            System.out.print("*");
        }
        
        // For printing the spaces after the stars in each row
        for (int j =0; j<i; j++)
        {
            System.out.print(" ");
        }
       

        // As soon as the stars for each iteration are printed, we move to the
        // next row and give a line break otherwise all stars
        // would get printed in 1 line.
        System.out.println();
    }
    
    //way 2 to do this
    
    // for(int i=0; i<n; i++){
    //     for(int j=0; j<=i; j++){
    //         System.out.print(" ");
    //     }
    //     for(int k=n+3;k>=(i*2);k--){
    //         System.out.print("*");
    //     }
    //     System.out.println("");
    // }
        
    }
}