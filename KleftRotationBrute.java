import java.util.Arrays;

//d=3               leftRotationBrute
//[1,2,3,4,5,6,7]
//[5,6,7,1,2,3,4]

public class KleftRotationBrute {
    private static int[] leftRotate(int[] arr, int n,int d) {
        d=d%n;
        int []temp=new int[d];
        //store before d element in temp 
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }
        // move after d to first..
        for (int i = d; i < n; i++) {
            arr[i-d]=arr[i];
            
        }
        //store before d to after 
        for (int i = n-d; i < n; i++) {
            arr[i]=temp[i-(n-d)];
        
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("");
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(leftRotate(arr,arr.length,5)));
        System.out.println(Arrays.toString(leftRotate(arr,arr.length,5)));
        // System.out.println(Arrays.toString(leftRotate(arr,arr.length,5)));
    }

}
