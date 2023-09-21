//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    int first = 0;
	    int sec = Integer.MIN_VALUE;
	    int third = Integer.MIN_VALUE;
	    for(int i  = 0; i<n; i++){
	        if(a[i] > first){
	            first = a[i];
	        }
	    }
	    
	    for(int i = 0; i<n; i++){
	        
	        if(a[i] > sec && first > a[i]){
	            sec = a[i];
	        }
	    }
	    
	    for(int i =0; i<n; i++){
	        if(a[i] > third && sec > a[i] && first > a[i]){
	            third = a[i];
	        }
	    }
	    
	    return third;
    }
}
