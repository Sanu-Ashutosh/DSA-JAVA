import java.util.Arrays;

import java.util.Scanner;

public class LargestEleArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int arr[] = { 63,
                49, 92, 15, 102, 72, 88, 13, 14, 103, 134, 45, 104, 139, 43, 119, 80, 84, 76, 80, 144, 125, 39, 5, 118,
                64, 137, 12, 50, 122, 58, 140, 58, 6, 49, 67, 9, 55, 14, 94, 109, 76, 114, 115, 130, 120, 83, 121, 58,
                6, 101, 52, 56, 63, 70, 26, 55, 64, 84, 65, 52, 112, 116, 100,1000 };
        System.out.println((Largest(arr, 0, arr.length)));
    }

    private static int Largest(int[] arr, int i, int length) {
        int max=arr[0];
        
        for (int j = 0; j < arr.length; j++) {
           if(arr[j]>max)
           {
                max=arr[j];
           }
            
        }
      return max;
    }

}
