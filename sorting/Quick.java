package sorting;
import java.util.Scanner;
public class Quick{
    static int partition(int[] arr , int l, int r){
        int pivot = arr[l];
        int low = l , right = r;
        while (l<r) {
            while (l<right && arr[l]<=pivot) l++;
            while (r>low &&  arr[r]>pivot) r--;
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        arr[low] = arr[r];
        arr[r] = pivot;
        return r;
    }

    static void quickSort(int[] arr , int l , int r){
        if(l<r){
            int partitioni = partition(arr, l, r);
            quickSort(arr, l, partitioni-1);
            quickSort(arr, partitioni+1, r);
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
        quickSort(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}

// O(nlogn) , O(N**2) on worst case
// O(n) for recursion stack