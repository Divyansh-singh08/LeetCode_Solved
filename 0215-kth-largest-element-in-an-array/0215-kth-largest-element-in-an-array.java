class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        
        //we can do using heap also
        //that will give use more optimize approch
        
        //make PQ of max heap first
        //by default it follow min heap
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
        
//         for(int i : nums){
//             pq.add(i);
//         }
//         while(pq.size() - k > 0){
//             pq.poll();
//         }
        
//         return pq.peek();
        
        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
        //to optimize more we use 
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i =0; i<nums.length;i++){
            if(pq.size() < k ){
                pq.add(nums[i]);
            }else{
                if(pq.peek()<nums[i]){
                    pq.poll();
                    //add new value
                    pq.add(nums[i]);
                }
            }
        }
        return pq.peek();
    }
}