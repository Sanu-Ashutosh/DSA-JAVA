import java.util.*;

public class RevArrUsingreq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array length : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
       System.out.println(Arrays.toString( rev(0, arr, n-1)) );
    }

    private static int[] rev(int i, int[] arr, int n) {
        if(i>n) return arr;
        else
        {
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;    
        }
        rev(i+1, arr, n-1);
        return arr;
    }
}