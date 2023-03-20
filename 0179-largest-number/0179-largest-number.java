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
        //this will handle all age case and compair and sort them
        Arrays.sort(st,(a,b)->(b + a).compareTo(a + b));
        
        //we use stringbuler for concatenate all string
        ////we use stringbuler for concatenate all string into it from the arrayString
        StringBuilder sb = new StringBuilder();
        for(String str : st){
            sb.append(str);
        }
        
        //create another string result
        ////create another string result for making setbuilder into the String
        String res = sb.toString();
        
        //now just we check
        return res.startsWith("0")? "0": res;
        
    }
}