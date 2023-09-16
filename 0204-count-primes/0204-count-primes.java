class Solution {
    public int countPrimes(int n) {
        if(n<2)
            return 0;
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2; i*i<=n; i++)
        {
            for(int j=2*i; j<=n; j+=i)
                prime[j] = false;
        }
        int count=0;
        for(int i=0; i<n; i++)
            if(prime[i])
                count++;
        return count;
    }
}


/*
 this is normal case program

class Solution {
    public static boolean isPrime(int no){
        int count = 0;
        boolean check = false;
        for(int i = 1; i*i<=no; i++){
            
            if(no%i == 0){
                count++;
                if((no/i) != i){
                    count++;
                }
            }
        }
        
        if(count == 2){
            check = true;
        }
        return check;
    }
    
    public int countPrimes(int n) {
        int pCount = 0;
        for(int i =2; i<n; i++){
            if(isPrime(i)){
                pCount++;
            }
        }
    return pCount;
    }
}


*/