import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int arr[] = { 63,
                49, 92, 15, 102, 72, 88, 13, 14, 103, 134, 45, 104, 139, 43, 119, 80, 84, 76, 80, 144, 125, 39, 5, 118,
                64, 137, 12, 50, 122, 58, 140, 58, 6, 49, 67, 9, 55, 14, 94, 109, 76, 114, 115, 130, 120, 83, 121, 58,
                6, 101, 52, 56, 63, 70, 26, 55, 64, 84, 65, 52, 112, 116, 100 };
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length)));
    }

    private static int[] quickSort(int[] arr, int i, int j) {
        qs(arr, i, j-1);
        return arr;
    }

    public static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pvt = pivotElement(arr, low, high);
            qs(arr, low, pvt - 1);
            qs(arr, pvt + 1, high);
        }

    }

    static int pivotElement(int[] arr, int low, int high) {
        int pvt = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[i] <= pvt && i <= high - 1) {
                i++;
            }
            while (arr[j] >  pvt && j >= low+1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return j;
    }
}
