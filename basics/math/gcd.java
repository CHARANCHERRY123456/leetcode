package math;
class Solution {
    public static int gcd(int a, int b) {
        if(a>b) return gcd(b,a);
        if(a==0) return b;
        return gcd(b%a , a);
    }
}
