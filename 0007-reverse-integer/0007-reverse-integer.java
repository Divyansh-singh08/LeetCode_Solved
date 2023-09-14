class Solution {
    public int reverse(int x) {
        int count = 0;
        while(x != 0){
            int rem = x%10;
            int newCount = count*10 + rem;
            if((newCount - rem)/10 != count){
                return 0;
            }
            count = newCount;
            x = x/10;
        }
        // return (int)count == count ? (int)count : 0;
        return count;

    }
}