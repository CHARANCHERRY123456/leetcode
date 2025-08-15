class Solution {
    static boolean armstrongNumber(int n) {
        int temp = n;
        int ams = 0;
        while(temp != 0){
            int d = temp % 10;
            // int conversion is optional
            ams +=(int) Math.pow(d , 3);
            temp = temp / 10;
        }
        return ams == n;
    }
}