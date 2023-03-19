class Solution {
    public int[][] merge(int[][] intervals) {
        // //using stack 
        // Stack<Interval> stack = new Stack();
        // Collections.sort(intervals, (a,b) -> a.start - b.start);
        // for(Interval it: intervals){
        //     if(stack.isEmpty() || it.start > stack.peek().end) stack.push(it);
        //     else{
        //         stack.peek().end = Math.max(it.end, stack.peek().end);
        //     }
        // }
        // return new ArrayList(stack);
        
        List<int[]> res = new ArrayList<>();//for storing ans
        //check the base case
        if(intervals.length == 0 ||intervals == null)
            return res.toArray(new int[0][]);//empty 2D array
        //sort the array if array not sort
        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        //iterate it
        for(int[] i :intervals){
            if(i[0] <= end){
                end = Math.max(end,i[1]);
            }else{
                res.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start,end});
        //convet the list into 2d array then return
        return res.toArray(new int[0][]);
    }
}