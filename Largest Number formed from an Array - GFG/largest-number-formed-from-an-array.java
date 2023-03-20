//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        //now need to sort the array using comparator function
        //here concatenation happen like 330 , 303
        Arrays.sort(arr,(a,b)->(b + a).compareTo(a+b));
        
        // my string is sorted and show in form or array 
        //now need to convert the array string into the single string
        //so we use stringBuilder
        StringBuilder s = new StringBuilder();
        for(String str : arr){
            s.append(str);
        }
        
        //now got the single string
        // but now  need to convert to the main original string
        //toString convert the StringBuilder to main String
        String ansS = s.toString();
        
        //now return
        return ansS;
        
    }
}