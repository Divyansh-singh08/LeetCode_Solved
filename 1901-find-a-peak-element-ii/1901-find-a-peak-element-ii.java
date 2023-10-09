class Solution {
    
    static int pick1D(int[][] arr2D,int row,int col,int mid){
        //here we finding the maxim value in the 2d array
        //need to retrn the index of max element
        int maxValue = -1;
        int index = -1;
        
        for(int i = 0; i < row; i++){
            if(arr2D[i][mid] > maxValue){
                maxValue = arr2D[i][mid];
                //we need the row 
                //that why we passing the row index
                index = i;
            } 
        }
        
        return index;
    }
    
    /*
        
        
        
    */
    
    public int[] findPeakGrid(int[][] mat) {
       
        int row = mat.length;
        int col = mat[0].length;
        
        int l = 0;
        int h = col-1;
        
        while(l<=h){
            int mid = (l+h)/2;
            
            //you will bring the index of max element in the col of the 2D array
            //mean in which row your value lie
            int inRowIndex = pick1D(mat,row,col,mid);
            
            //store the left side value of inRowIndex into left variable
            int leftValue = mid-1 >= 0 ? mat[inRowIndex][mid-1] : -1;
            
            //store the right side  value of inRowIndex variable
            int rightValue = mid+1 < col ? mat[inRowIndex][mid+1] : -1;
            
            //now campair it
            // if col matrix is greater then left and right (mean from row side)
            if(leftValue < mat[inRowIndex][mid] && mat[inRowIndex][mid] > rightValue){
                return new int[]{inRowIndex,mid};
            }
            else if( leftValue > mat[inRowIndex][mid]){
                //LeftValue is greater check value
                
                //neglate the right side
                h = mid - 1;
            }else{
                //rightValue is greater then check value
                l = mid + 1;
            }
            
            
        }
        
        return new int[]{-1,-1};        
        
    }
}













