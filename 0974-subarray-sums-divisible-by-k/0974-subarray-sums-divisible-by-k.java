class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int cumlaSum = 0;
        int count = 0;
        for(int i=0; i< nums.length; i++){
            cumlaSum+=nums[i];
            int r = cumlaSum%k;
            if(r<0){
                r=r+k;
            }
            if(map.containsKey(r)){
                count+=map.get(r);
            }
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
        
    }
}