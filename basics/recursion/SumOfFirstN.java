package recursion;

import java.util.Scanner;

public class SumOfFirstN {
    static int sum(int n){
        if(n == 1) return n;
        return sum(n-1) + n;
        

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = sum(n);
        System.out.print(sum);

    } 
}
