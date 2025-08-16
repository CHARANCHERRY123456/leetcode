package recursion;

import java.util.Scanner;

class fibSeries {
    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int prev = fib(n-1);
        int pprev = fib(n-2);
        int cur = prev + pprev;
        return cur;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(fib(i) + " ");
    }
}

// space : O(n)
// time complexity : O(2**n)
// with using cache we can make it to O(n)