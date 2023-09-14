//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        // code here
    
        int count = 0;
        for(int i = 1; i*i <=N; i++){
            
            if(N%i == 0){
                //here u get one prime number
                count++;
                //need to take another prime number
                if((N/i) != i){
                    count++;
                }
            }
        }
        
        // if(count != 2){
        //     return 0;
        // }else{
        //     return 1;
        // }
        
        return (count == 2 ? 1 : 0);
        
    }
}