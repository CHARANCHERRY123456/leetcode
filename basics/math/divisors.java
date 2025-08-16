package math;
import java.util.Stack;
class Solution {
    public static void print_divisors(int n) {
        Stack<Integer> arr = new Stack<Integer>();
        for(int num=1;num<=Math.sqrt(n);num++){
            if(n % num == 0){
                System.out.print(num + " ");
                // if 1 is divisor then n/1 is also a divisor
                if((int)n/num != num)
                    arr.add((int)n/num);
            }
        }   
        for(int i=arr.size()-1;i>=0;i--)
            System.out.print(arr.get(i) + " ");

    }
}