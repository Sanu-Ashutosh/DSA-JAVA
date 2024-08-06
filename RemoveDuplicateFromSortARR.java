import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateFromSortARR {
    public static int removeDuplicates(int[] arr, int n) {
        // Write your code here.
        Arrays.sort(arr);
        //[1,1,2,2,3,4]
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int arr[] = { 63,
                49, 92, 15, 102, 72, 88, 13, 14, 103, 134, 45, 104, 139, 43, 119, 80, 84, 76, 80, 144, 125, 39, 5, 118,
                64, 137, 12, 50, 122, 58, 140, 58, 6, 49, 67, 9, 55, 14, 94, 109, 76, 114, 115, 130, 120, 83, 121, 58,
                6, 101, 52, 56, 63, 70, 26, 55, 64, 84, 65, 52, 112, 116, 100 };
        for (int i = 0; i < removeDuplicates(arr, arr.length); i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
