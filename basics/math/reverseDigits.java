package math;
class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if(x < 0) {
            isNeg = true;
            x = -x;
        }
        long ans = 0;
        int temp = x;
        while(temp!=0){
            int d = temp % 10;
            ans = (ans * 10) + d;
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
                return 0;
            }
            temp = temp /10;
        }
        int res = (int) ans;
        return isNeg?-res:res;
    }
}


class Solution2 {
    public int reverse(int val) {
        long res = 0;
        while(val != 0){
            res = res *10 + val%10;
            val = val/10;
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)return 0;
        }
        return (int)res;
    }
}