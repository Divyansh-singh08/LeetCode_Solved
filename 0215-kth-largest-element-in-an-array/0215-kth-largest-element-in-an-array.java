class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        
        //we can do using heap also
        //that will give use more optimize approch
        
        //make PQ of max heap first
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : nums){
            pq.add(i);
        }
        while(pq.size() - k > 0){
            pq.poll();
        }
        
        return pq.peek();
        
    }
}