class Solution {
     public static void fnCombination2(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        //base case
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = ind; i < arr.length; i++){
            //ultimate base case   
            if(i > ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            //add
            ds.add(arr[i]);
            fnCombination2(i+1,arr,target - arr[i],ans,ds);//pick by loop
            ds.remove(ds.size() - 1);
        }
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);//sort the array to get accurate ans
        fnCombination2(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
}