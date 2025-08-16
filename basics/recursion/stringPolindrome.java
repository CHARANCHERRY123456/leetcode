package recursion;

import java.util.Scanner;

public class stringPolindrome {
    static boolean isPolindrome(String s , int i , int j ){
        if(i>j) return true;
        char left = s.charAt(i);
        char right = s.charAt(j);
        if(left != right) return false;
        return isPolindrome(s, i+1, j-1);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        boolean isPol = isPolindrome(s,0,n-1);
        System.out.print(isPol);
    }
}


// tc : O(n)
// sc : O(n)