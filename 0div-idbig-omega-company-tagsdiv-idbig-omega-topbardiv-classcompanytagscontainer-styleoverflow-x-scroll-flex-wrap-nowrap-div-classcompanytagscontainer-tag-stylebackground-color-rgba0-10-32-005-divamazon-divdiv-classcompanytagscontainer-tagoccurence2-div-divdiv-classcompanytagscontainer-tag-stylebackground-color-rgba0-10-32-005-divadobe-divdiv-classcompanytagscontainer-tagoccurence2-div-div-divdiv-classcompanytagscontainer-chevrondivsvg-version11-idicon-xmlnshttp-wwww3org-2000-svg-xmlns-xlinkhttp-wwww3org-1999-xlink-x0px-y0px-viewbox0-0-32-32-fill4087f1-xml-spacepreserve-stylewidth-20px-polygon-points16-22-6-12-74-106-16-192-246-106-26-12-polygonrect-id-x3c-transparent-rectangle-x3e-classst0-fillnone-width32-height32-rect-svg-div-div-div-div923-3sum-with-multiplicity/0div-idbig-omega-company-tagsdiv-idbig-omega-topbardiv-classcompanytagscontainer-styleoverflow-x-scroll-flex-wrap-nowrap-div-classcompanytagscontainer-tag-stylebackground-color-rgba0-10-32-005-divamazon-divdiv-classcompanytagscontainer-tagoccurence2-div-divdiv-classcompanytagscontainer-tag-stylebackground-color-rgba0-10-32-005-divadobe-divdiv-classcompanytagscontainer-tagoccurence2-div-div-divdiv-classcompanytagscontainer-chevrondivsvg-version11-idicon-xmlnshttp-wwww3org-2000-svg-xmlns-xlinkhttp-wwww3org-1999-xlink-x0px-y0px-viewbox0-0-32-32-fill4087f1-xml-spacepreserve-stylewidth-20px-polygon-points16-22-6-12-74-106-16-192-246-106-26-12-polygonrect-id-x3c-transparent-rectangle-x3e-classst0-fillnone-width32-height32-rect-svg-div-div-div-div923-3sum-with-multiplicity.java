class Solution {
    public int threeSumMulti(int[] arr, int target) {
        
        int n = arr.length;
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
        
        
        int mod = 1_000_000_007;
        long result = 0;
        
        for(int i = 0; i<n; i++){
            int count[] = new int[101];
            for(int j = i+1; j<n; j++){
                int k = target - arr[i] - arr[j];
                
                if(k>=0 && k<=100 && count[k]>0){
                    result = result + count[k];
                    result = result%mod;
                }
                count[arr[j]]++;
            }
        }
        return (int)result;
    }
}