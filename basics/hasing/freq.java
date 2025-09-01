package hasing;
import java.util.HashMap;
import java.util.Scanner;

class Solution{
    static void countFreq(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ENter element : ");
            arr[i] = scan.nextInt();
        }
        countFreq(arr);
        scan.close();
    }
}

// space complexity : O(n)
// time complexity : O(n)