class Solution {
    public boolean isPalindrome(int x) {
        
        boolean check = true;
        int newNum = x;
        int value = 0;
        while(x > 0){
            int rem = x%10;
            value = value*10 + rem;
            x = x/10;
        }
        
        if(newNum != value){
            check = false;
        }
        
        return check;
    }
}