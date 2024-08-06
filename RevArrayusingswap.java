import java.util.*;

public class RevArrayusingswap {
  static  int[] rev(int[] arr)
    {
        
        int st=0;
        int end=arr.length-1;
        
        while(st<end)
        {
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return arr;
    }
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    int[] arr={100,2,3,4,5};
   
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.println(rev(arr[i]));
    // }
   
    System.out.println("Reverse of the array is : "+Arrays.toString(rev(arr)));
    }
}