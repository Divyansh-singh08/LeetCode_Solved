class Solution {
    public int candy(int[] ratings) {
        
        // int nCandy = ratings.length;
        // int count = 0;
        // for(int i = 0; i < nCandy-1; i++){
        //     if(ratings[i] > ratings[i+1] || ratings[i] < ratings[i+1]){
        //         count++;
        //     }
        // }
        // return (count + nCandy);
        
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
        
    }
}