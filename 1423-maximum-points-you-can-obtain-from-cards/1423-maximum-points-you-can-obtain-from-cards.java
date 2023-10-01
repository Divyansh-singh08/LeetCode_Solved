class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int j = n-1;
        int i;
        for(i = 0; i<k; i++){
            sum+=cardPoints[i];
        }
        
        i--;
        int ans = sum;
        
        for(j = n-1; j>n-1-k; j--){
            sum = sum - cardPoints[i] + cardPoints[j];
            i--;
            ans = Math.max(ans,sum);
        }
        
        return ans;
        
    }
}