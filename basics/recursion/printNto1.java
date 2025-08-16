package recursion;

import java.util.Scanner;

class Main{
    static void recursion(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        recursion(n-1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        recursion(n);
    }
}