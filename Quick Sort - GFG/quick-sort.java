//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        //till up to when it should stop
        //base case
        if(low > high) return;
        
        int pivot = arr[high];
        int pIndex = partition(arr,low,high,pivot);
        // pIndex --> all time sorted 
        //for the left part array to again do partition on it using Recursion
        quickSort(arr,low,pIndex -1);
        //for the right part array to again do partition on it using Recursion
        quickSort(arr,pIndex+1,high);
        
        
    }
    static int partition(int arr[], int low, int high,int pivot)
    {
        // your code here
        int iPointer = low;
        int jPointer = low;
        
        while(iPointer <= high){
            
            if(arr[iPointer] > pivot){
                iPointer++;
            }else{
                swap(arr,iPointer,jPointer);
                iPointer++;
                jPointer++;
            }
        }
        
        return (jPointer-1);
        
    }
    
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
