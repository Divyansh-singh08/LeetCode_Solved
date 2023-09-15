class Solution {
    public int addDigits(int num) {
        ///iterative approch
//         while(num >= 10){
            
//             int sum = 0;
//             while(num > 0){
//                 int rem = num%10;
//                 sum = sum + rem;
//                 num = num/10;
//             }
//             num = sum;
//         }
//         return num;
        
        // ------> //optimal Approch
        if(num == 0){
            return num;
        }else if(num%9 == 0){
            return 9;
        }else{
            return (num%9);
        }
        
    }
}