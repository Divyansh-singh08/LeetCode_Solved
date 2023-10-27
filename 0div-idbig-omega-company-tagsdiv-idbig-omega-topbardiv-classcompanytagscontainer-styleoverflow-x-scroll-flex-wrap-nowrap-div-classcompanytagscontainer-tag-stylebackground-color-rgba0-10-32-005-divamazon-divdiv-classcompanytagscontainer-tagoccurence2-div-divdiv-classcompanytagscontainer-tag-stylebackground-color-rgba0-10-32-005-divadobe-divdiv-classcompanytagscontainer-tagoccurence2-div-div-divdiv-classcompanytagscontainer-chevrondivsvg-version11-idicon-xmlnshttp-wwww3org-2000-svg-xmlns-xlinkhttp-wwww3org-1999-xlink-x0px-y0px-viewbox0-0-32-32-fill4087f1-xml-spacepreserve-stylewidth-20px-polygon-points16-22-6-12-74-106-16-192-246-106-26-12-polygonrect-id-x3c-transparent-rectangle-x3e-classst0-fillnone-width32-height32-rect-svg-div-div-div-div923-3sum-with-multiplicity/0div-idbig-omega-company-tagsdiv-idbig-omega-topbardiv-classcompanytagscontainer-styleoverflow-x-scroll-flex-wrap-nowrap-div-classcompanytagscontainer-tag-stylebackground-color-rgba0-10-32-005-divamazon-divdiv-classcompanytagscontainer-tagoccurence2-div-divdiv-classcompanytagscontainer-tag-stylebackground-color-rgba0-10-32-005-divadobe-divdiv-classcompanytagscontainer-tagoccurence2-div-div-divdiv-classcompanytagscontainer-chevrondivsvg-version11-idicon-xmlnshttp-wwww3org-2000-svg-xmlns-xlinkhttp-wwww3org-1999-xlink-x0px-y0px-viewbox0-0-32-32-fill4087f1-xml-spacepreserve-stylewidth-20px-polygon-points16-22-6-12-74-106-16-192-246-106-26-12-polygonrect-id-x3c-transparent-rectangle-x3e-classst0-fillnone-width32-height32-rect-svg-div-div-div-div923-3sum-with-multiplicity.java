class Solution {
    public int threeSumMulti(int[] arr, int target) {
        // int n = arr.length;
        //OPTIMAL SOLUTION
        int mod = 1_000_000_007;
        long res = 0;
        long[] cnt = new long[101];
        
        for(int i : arr){
            cnt[i]++;
        }
        
        for(int i = 0;i<=100; i++){
            for(int j = i; j<=100; j++){
                int k = target - i - j;
                
                if(k < 0 || k > 100) continue;
                
                if(i == j && j == k){
                    res = res + (cnt[i] * (cnt[i]-1) * (cnt[i]-2) / 6);
                    
                }else if( i == j && j != k){
                    res = res + (((cnt[i] * (cnt[i]-1))/2) * cnt[k]);   
                }else if(i < j && j < k){
                    res = res + (cnt[i] * cnt[j] * cnt[k]);
                }
            }
        }
        
        return (int)(res%mod);
    }
}
        
        
//         // int sum = 0;
//         int cnt = 0;
//         for(int i = 0; i<n-2; i++){
//             int j = i+1;
//             int k = n-1;
            
//             while(j < k){
                
//                 if(target == (arr[i]+arr[j]+arr[k])){
//                     cnt++;
//                     k--;
                    
//                 }else if(target > (arr[i]+arr[j]+arr[k])){
//                     j++;
//                 }else{
//                     k--;
//                 }
                
//             }
//         }
//         return cnt;
        
        
        
        
        
        
        
//         // T.C - >O(n^2) S.P -O(1)
        
//         int mod = 1_000_000_007;
//         long result = 0;
        
//         for(int i = 0; i<n; i++){
//             int count[] = new int[101];
//             for(int j = i+1; j<n; j++){
//                 int k = target - arr[i] - arr[j];
                
//                 if(k>=0 && k<=100 && count[k]>0){
//                     result = result + count[k];
//                     result = result%mod;
//                 }
//                 count[arr[j]]++;
//             }
//         }
//         return (int)result;
    // }
// }