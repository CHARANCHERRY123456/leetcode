package hasing;
import java.util.HashMap;
import java.util.Scanner;

class Solution{
    static void countFreq(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int minc = -1,minv = Integer.MAX_VALUE;
        int maxc = -1,maxv = Integer.MIN_VALUE;
        for(HashMap.Entry<Integer , Integer> entry : map.entrySet()){
            if(minv > entry.getValue()){
                minc = entry.getKey();
                minv = entry.getValue();
            }
            if(maxv < entry.getValue()){
                maxc = entry.getKey();
                maxv = entry.getValue();
            }
        }
        System.out.println(minc + " " + maxc);
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