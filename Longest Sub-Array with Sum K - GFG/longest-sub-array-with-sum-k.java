//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        
        //Optimal Two Pointer Approch
        // //not working
        // int maxL = 0;
        // int iPointer = 0;
        // int jPointer = 0;
        // int sum = A[0];
        // while(jPointer < N){
            
        //     while(iPointer <= jPointer && sum > K ){
        //         //now the Required value is less
        //         //we  reduce to the near to the required value
        //         sum = sum - A[iPointer];
        //         iPointer++;
        //     }
            
        //     if(sum == K){
        //         maxL = Math.max(maxL,jPointer - iPointer + 1);
        //     }
            
        //     jPointer++;
        //     if(jPointer < N){
        //         sum = sum + A[jPointer];
        //     }
            
        // }
        
        // return maxL;
        
        
        
        
        
        
        
        
        
        
        
        
        //Complete the function
        //
        // brute force 
        // int maxL = 0;
        
        // for(int i = 0; i<N; i++){
        //     int count = 0;
        //     for(int j = i; j < N; j++){
                
        //         count = count + A[j];
                
        //         if(count == K){
        //             maxL = Math.max(maxL,j-i+1);
        //         }
        //     }
        // }
        // return maxL;
        
        
        
        //Better solution 
      HashMap<Integer,Integer> map = new HashMap<>();
      int sum = 0;
      int maxL = 0;
      for(int i = 0; i<N; i++){
          sum = sum + A[i];
           
          if(sum == K){
              //checking is it subArray
              maxL = Math.max(maxL,i+1);
          }
           
          //this is done for calculation of the left part
          int rem = sum - K;
           
          //is map contain this this things
          if(map.containsKey(rem)){
              //if this is present
              int len = i - map.get(rem);
              //make update the  maxLength
              maxL = Math.max(maxL,len);
          }
           
          //if not present in it
          //or not contain in it 
          //then map make contain in it
          if(!map.containsKey(sum)){
              map.put(sum,i);
          }
      }
      return maxL;
       
        
    }
    
    
}


