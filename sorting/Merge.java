package sorting;
import java.util.Scanner;
public class Merge{
    static void merge(int[] arr , int l , int m , int r){
        int k = l , i=l,j=m+1;
        int[] tempa = arr.clone();
        while (i<=m && j<=r) {
            if(arr[i] < arr[j]) tempa[k++] = arr[i++];
            else tempa[k++] = arr[j++];
        }
        while (i<=m) tempa[k++] = arr[i++];
        while (j<=r) tempa[k++] = arr[j++];
        for(int x=l;x<=r;x++) arr[x] = tempa[x];

    }

    static void mergeSort(int[] arr , int l , int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
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
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}

// O(nlogn)
// o(n) for extra array