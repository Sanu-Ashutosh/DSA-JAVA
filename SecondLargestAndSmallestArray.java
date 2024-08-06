
import java.util.*;

public class SecondLargestAndSmallestArray {

    public static int[] getSecondOrderElements(int[] a, int n) {
        // Write your code here.
        int[] arr = new int[2];
        arr[0] = secLargest(a, n);
        arr[1] = secSmallest(a, n);

        return arr;
    }

    private static int secSmallest(int[] a, int n) {
        int firstSmall = firstSmallest(a, n);
        int secSmall = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < secSmall && a[i] != firstSmall) {
                secSmall = a[i];
            }

        }

        return secSmall;
    }

    private static int secLargest(int[] a, int n) {
        int fl = firstLargest(a, n);
        int sl = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > sl && a[i] != fl) {
                sl = a[i];
            }
        }
        return sl;
    }

    private static int firstLargest(int[] a, int n) {
        int large = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                large = a[i];
            }

        }
        return large;
    }

    private static int firstSmallest(int[] a, int n) {
        int small = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                small = a[i];
            }

        }
        return small;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int arr[] = { 14, 2, 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(getSecondOrderElements(arr, arr.length)));
        System.out.println((firstSmallest(arr, arr.length)));
    }
}
