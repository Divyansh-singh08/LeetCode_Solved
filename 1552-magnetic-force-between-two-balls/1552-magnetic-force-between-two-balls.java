class Solution {
    
    static boolean canMForcePossible(int[] pos,int basket,int ball){
        int lastBasket = -1;
        for(int i = 0; i < pos.length; i++){
            
            if(pos[i] - lastBasket >= ball || lastBasket == -1){
                basket--;
                lastBasket = pos[i];
            }
            
            if(basket == 0) break;
        }
        
        if(basket == 0){
            return true;
        }
        return false;
    }
    
    public int maxDistance(int[] position, int m) {
        
        int n = position.length;
        Arrays.sort(position);
        int low = 0;
        int high = 1_000_000_000;
        
        while(low < high){
            
            int mid = low + (high - low + 1)/2;
            if(canMForcePossible(position,m,mid) == true){
                low = mid;
            }else{
                high = mid - 1;
            }
        }
        
        return low;
        
    }
}