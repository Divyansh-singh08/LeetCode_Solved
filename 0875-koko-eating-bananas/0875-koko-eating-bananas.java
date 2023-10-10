class Solution {
    
    static boolean isPossible(int[] piles,int h,int midSpeed){
        int time = 0;
        
        for(int i = 0; i < piles.length; i++){
            time += (int)Math.ceil((piles[i]*1.0)/midSpeed);
        }
        // System.out.println(time);
        
        return (0 < time && time <= h) ? true : false; 
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        
        //find the array max value O(n) time complexity
        int max = Integer.MIN_VALUE;
        for(int maxV : piles){
            max = Math.max(max,maxV);
        }
        
        //base case
        // mean if you have 5 piles then you have
        // to choice the max piles value then 
        // you have to make max speed of that piles value
        
        if(h == piles.length){
            return max;
        }
        
        int EatSpeed = Integer.MAX_VALUE;
        
        int low  = 0;
        int high = max;
        
        while(low <= high){
            int midSpeed = low + (high- low)/2; //to avoid overflow
            
            //here we check the eating with min speed is valid to eat with in  given time frame
            if(isPossible(piles,h,midSpeed) == true){
                
                //store the maxSpeed 
                EatSpeed = midSpeed;
                
                //if possible with the larger speed 
                //all piles can u eaten then try with some smaller speed
                high = midSpeed - 1;
                
            }else{
                //in not possible then try to do bigger speed
                // to make bigger speed increase the 
                low = midSpeed + 1;
            }
        }
        
        return EatSpeed;
    }
}