class Solution {
    static int evenlyDivides(int n) {
        int temp = n;
        int ans = 0;
        while(temp>0){
            int d = temp % 10;
            // to handle the zero division error
            if(d!=0 && n%d == 0)
                ans += 1;
            temp = temp / 10;
        }
        return ans;
    }
}