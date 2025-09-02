package sorting;
import java.util.Scanner;
public class Insertion{
    static void sortBro(int[] arr){
        int n = arr.length;
        // insert in the sorted part
        for(int usi=1;usi<n;usi++){
            int temp = arr[usi];
            int j;
            for(j=usi-1;j>=0;j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else break;
            }
            arr[j+1] = temp;
        }
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
        sortBro(arr);
        scan.close();
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// tc  : O(n**2) , O(n)
// sc : O(1)