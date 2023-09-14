class Solution {
    public int reverse(int x) {
        long count = 0;
        while(x != 0){
            long rem = x%10;
            // count += rem;
            count = count*10 + rem;
            x = x/10;
        }
        return (int)count == count ? (int)count : 0;

    }
}