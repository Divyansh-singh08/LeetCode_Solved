class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        
        int sum = 0;
        
        //add the total sum of array
        for(int i = 0; i < n; i++){
            sum+=cardPoints[i];
        }
        if(n == k) return sum;
        int maxValue = 0;
        //now manging the  window 
        int slidingWindow = 0;
        for(int i = 0; i<n-k-1; i++){
            slidingWindow = slidingWindow + cardPoints[i];
        }
        
        for(int i = n-k-1; i<n; i++){
            slidingWindow += cardPoints[i];
            maxValue = Math.max(maxValue, (sum - slidingWindow));
            slidingWindow -= cardPoints[i - (n-k-1)];
            
        }
        
        return maxValue;
        
        
        
        
        
        
        
        
        
        
        //         int n = cardPoints.length;
//         int sum = 0;
//         int j = n-1;
//         int i;
//         for(i = 0; i<k; i++){
//             sum+=cardPoints[i];
//         }
        
//         i--;
//         int ans = sum;
        
//         for(j = n-1; j>n-1-k; j--){
//             sum = sum - cardPoints[i] + cardPoints[j];
//             i--;
//             ans = Math.max(ans,sum);
//         }
        
//         return ans;
        
    }
}