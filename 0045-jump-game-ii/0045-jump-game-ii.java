class Solution {
    public int jump(int[] nums) {
        
         //  [2,3,1,1,4]
        int jumps = 0;//this will count min jumps to reach
        int cur = 0;
        int curFarthest = 0;//this tell that upto where element maximum can jump...
	    for (int i = 0; i < nums.length - 1; i++) {
		    curFarthest = Math.max(curFarthest, i + nums[i]);//reach upto maximum index 
		    if (i == cur) {
			    jumps++;
			    cur = curFarthest;
		    }
	    }
	    return jumps;
    }
}