class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        
        //create a string
        String[] st = new String[n];
        //convert all the interger number to the string by using
        //valueOf() method in java
        for(int i = 0; i < n ;i++){
            st[i] = String.valueOf(nums[i]);
        }
        //as we need in decendeing order
        Arrays.sort(st,(a,b)->(b + a).compareTo(a + b));
        
        //we use stringbuler for concatenate all string
        
        StringBuilder sb = new StringBuilder();
        for(String str : st){
            sb.append(str);
        }
        
        //create another string result
        String res = sb.toString();
        
        //now just we check
        return res.startsWith("0")? "0": res;
        
    }
}