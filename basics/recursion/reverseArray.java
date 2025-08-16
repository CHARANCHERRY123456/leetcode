package recursion;

import java.util.Scanner;

public class reverseArray {
    static int[] rev(int[] arr , int i , int j){
        if(i>j) return arr;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        rev(arr, i+1, j-1);
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number at" + i +  ": ");
            arr[i] = scan.nextInt();
        }
        int[] reversed = rev(arr , 0 , n-1);
        for(int i=0;i<n;i++){
            System.out.print(reversed[i]);
        }

    }
}


// tc : O(n)
// sc : O(n)