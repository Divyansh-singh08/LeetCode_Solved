class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int n = deck.length;
        // if(n%3 == 0){
        //     return false;
        // }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //map all the array element in {key value} 
        for(int i = 0; i<deck.length; i++){
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        
        int ans = 0;
        //iterate to the map now check is the occurance of each using gcd
        for(int key : map.keySet()){
            ans = gcd(ans,map.get(key));
        }
        
        if(ans>1){
            return true;
        }
        else{
            return false;
        }
          
    }
    //finding gcd of two number using recursion
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        
        return gcd(b,a%b);
    }
}