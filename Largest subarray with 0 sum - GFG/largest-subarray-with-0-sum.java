//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        int K = 0;
        for(int i = 0; i <n; i++){
            
            //check subarray by sum
            sum = sum + arr[i];
            
            //check it is it match with 0
            if(sum == 0){
                maxLen = Math.max(maxLen,i+1);
            }
            
            int leftSide = sum - K ;
            
            if(map.containsKey(leftSide)){
                
                int len = i - map.get(leftSide);
                
                maxLen = Math.max(maxLen,len);
            }
            
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            
        }
        
        return maxLen;
        
    }
}