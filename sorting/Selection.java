package sorting;
import java.util.Scanner;
public class Selection{
    static void sortBro(int[] arr){
        // find small and keep it in front
        for(int smalli=0;smalli<arr.length;smalli++){
            int cursi = smalli;
            for(int i=smalli+1;i<arr.length;i++){
                if(arr[i] < arr[cursi]){
                    cursi = i;
                }
            }
            System.out.println(smalli + " " + cursi);
            if(cursi != smalli){
                int temp = arr[cursi];
                arr[cursi] = arr[smalli];
                arr[smalli] = temp;
            }
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

// tc  : O(n**2)
// sc : O(1)