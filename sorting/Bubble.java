package sorting;
import java.util.Scanner;
public class Bubble{
    static void SortBro(int[] arr){
        int n = arr.length;
        int times = 0;
        for(int i =0 ;i<n;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                times++;
                // compare with prev element
                if(arr[j] > arr[j+1]){
                    // swap j , j+1
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        System.out.println(times + " times worked to sort array");

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ENter element : ");
            arr[i] = scan.nextInt();
        }
        SortBro(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}

// worst case : O(n^2)
// with swapped keyword in best case : O(N)
// spave : O(1)