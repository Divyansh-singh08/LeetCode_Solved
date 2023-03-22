//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        
        // int temp[] = new int[n];
        // int j=0;
        // //now store positive element
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>=0){
        //         temp[j]=arr[i];
        //         j++;
        //     } 
        // }
        
        // //exist case
        // if(j == n || j == 0){
        //     return;
        // }
        
        // //now store negative element
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<0){
        //         temp[j]=arr[i];
        //         j++;
        //     }
        // }
        
        // for(int i=0;i<temp.length;i++){
        //     arr[i]=temp[i];
        // }
        
        
        int temp[] = new int[n];
        //this is done for the storing the positive value first
        int it = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i]>0){
                temp[it] = arr[i];
                it++;
            }
        }
        
        //now iterate throughthe left value it
        for(int i=0; i < arr.length; i++){
            if(arr[i]<0){
                temp[it]=arr[i];
                it++;
            }
        }
        
        for(int m = 0; m<temp.length; m++){
            arr[m]=temp[m];
        }
        
        
        
        
        
    }
}