class Solution {
    
    public static int NCR(int n,int r){
        int res = 1;
        for(int i = 0; i<r; i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        
        return (int) res;
    }
    
    public List<List<Integer>> generate(int numRows) {
        int n = numRows;
//          List<List<Integer>> triangle = new ArrayList<>();
//         if (numRows == 0) return triangle;

//         triangle.add(new ArrayList<>());
//         triangle.get(0).add(1);

//         for (int i = 1; i < numRows; i++) {
//             List<Integer> prev_row = triangle.get(i - 1);
//             List<Integer> new_row = new ArrayList<>();
//             new_row.add(1);

//             for (int j = 1; j < prev_row.size(); j++) {
//                 new_row.add(prev_row.get(j - 1) + prev_row.get(j));
//             }

//             new_row.add(1);
//             triangle.add(new_row);
//         }

//         return triangle;
        
        
        // O(n^3)
        List<List<Integer>> ans = new ArrayList<>();
        
        // if(numRows == 0) return ans;
        for(int i = 1; i<=n; i++){
            List<Integer> list = new ArrayList<>();
            for(int col = 1; col <=i; col++){
                list.add(NCR(i-1,col-1));
            }
            
            ans.add(list);
        }
        
        return ans;
        
        
    }
}