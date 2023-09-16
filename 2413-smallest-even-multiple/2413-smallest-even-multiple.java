class Solution {
    public int smallestEvenMultiple(int n) {
        //  LCM find Using gcd - > T.C O(log min(n.m))
        
//         int m =2;
//         int val = n;
//         int gcd = 1;
//         while( n > 0 && m > 0){
//             if(n > m){
//                 n = n % m;
//             }else{
//                 m = m % n;
//             }
//         }
        
//         if(n == 0){
//             gcd = m;
//         }else{
//             gcd = n;
//         }
        
//         int lcm = 2*val / gcd;
//         return lcm;
        
        //    o(1) //
        //even multiples
        // return n << (n & 1);
        return  n % 2 == 0 ? n : n * 2;
        
        
    }
}