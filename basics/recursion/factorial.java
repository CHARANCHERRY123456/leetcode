// written by my own not compiled so may get errorrs
import java.util.Scanner;
class Main{
    // here we can use long if we consider the n>20
    static int fact(int n){
        if(n <= 1) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = fact(n);
        System.out.println(factorial);
    }
}

// time complextiy : O(n)
// space complexity : O(n)
