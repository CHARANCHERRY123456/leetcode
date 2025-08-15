class Solution {
    static boolean isPrime(int n) {
        if(n<2) return false;
        // check upto sqrt of that number
        for(int num=2;num<=Math.sqrt(n);num++){
            if(n % num == 0) return false;
        } 
        return true;
    }
}