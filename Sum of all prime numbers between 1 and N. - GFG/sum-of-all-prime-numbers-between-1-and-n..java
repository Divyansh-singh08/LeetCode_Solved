//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    // public long prime_Sum(int n)
    // {
    //     // code here----> this is iterative approch
    //     long sum = 0;
    //     while(n >= 2){
        
    //         int count = 0;
    //         for(int i=1; i*i<=n; i++){
    //             if(n%i == 0){
    //                 count++;
    //                 if((n/i) != i){
    //                     count++;
    //                 }
    //             }
    //         }
        
    //         if(count == 2){
    //             sum = sum + n;
    //         }
    //         n--;
    //     }
    //   return sum;
    // }
    
    
      public long prime_Sum(int n)
    {
        // code here
        if(n==1) return 0;
        long sum = 0;
        
        for(int i = 2; i<=n;i++){
            
            if(isPrime(i)==true){
                sum +=i;
            }
        }
        return sum;
    }
    
    static boolean isPrime(int num){
        
        for(int i= 2; i*i<=(num);i++){
            
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }
}