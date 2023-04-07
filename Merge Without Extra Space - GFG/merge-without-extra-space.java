//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    long arr1[] = new long[n];
		    long arr2[] = new long[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr1[i] = Long.parseLong(inputLine[i]);
		    }
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++){
		        arr2[i] = Long.parseLong(inputLine[i]);
		    }
		    Solution ob = new Solution();
		    ob.merge(arr1, arr2, n, m);
		    
		    StringBuffer str = new StringBuffer();
		    for(int i=0; i<n; i++){
		        str.append(arr1[i]+" ");
		    }
		    for(int i=0; i<m; i++){
		        str.append(arr2[i]+" ");
		    }
		    System.out.println(str);
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        // int i,j,k; i = j = 0; k = n-1;
        // long temp = 0;
        // while((k>=0 && j<m)&&(arr1[k]>arr2[j]))
        // {
        //     temp = arr1[k];
        //     arr1[k] = arr2[j];
        //     arr2[j] = temp;
        //     j++;k--;
        // }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        
        
        for(int i=0; i<n; i++){
            //now check
            if(arr1[i] > arr2[0]){
                // if first value is  greater then swap them
                //swapping
                long temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp; 
                // Arrays.sort(arr2);
                
                //after swapping we have to check that in arr2 is it in correct place placed
                long firstArr2 = arr2[0];
                int j;
                for(j=1; j < m && arr2[j] < firstArr2; j++){
                    //moving to this in left side..
                    arr2[j-1]=arr2[j];
                }
                arr2[j-1] = firstArr2;
                
            }
            
            // Arrays.sort(arr2);
            
        }
    }
}
