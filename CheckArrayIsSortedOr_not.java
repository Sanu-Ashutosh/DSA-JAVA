import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayIsSortedOr_not {
    public static int isSorted(int n, int[] a) {
        int ret = 1;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                ret = 0;
                break;
            }

        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int arr[] = { 1,2,3,3,4,5,6 };

        if(isSorted(arr.length, arr)==1)
        {
            System.out.println("Array is sorted");
        }
        else{
            
            System.out.println("Array is not sorted");
        }
        System.out.println((isSorted(arr.length, arr)));

    }
}
