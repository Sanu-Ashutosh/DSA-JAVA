import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergSort {
    public static void merge(int[] arr, int low,int mid, int high){
        ArrayList<Integer> temp=new ArrayList<Integer>();// temporary array 
        int left=low;           // starting index of left half of arr
        int right=mid+1;        // starting index of right half of arr
        //storing elements in the temporary array in a sorted manner//
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right]){
            temp.add(arr[left]);
            left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
         // if elements on the left half are still left //

        while(left<=mid)
        {
            temp.add(arr[left]);
            left++;
        }

        // if elements on the left another half are still right //

         while(right<=high)
        {
            temp.add(arr[right]);
            right++;
        }
        
        
        for (int i = low; i <=high; i++) {
            arr[i]=temp.get(i-low);
            
        }
        
       
    }

    public static int [] mergeSort(int[] arr, int low, int high){

        if(low>=high) return arr;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1,high );
        merge(arr,low,mid,high);
        return arr;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int arr[]={63,
            49, 92, 15 ,102 ,72, 88, 13, 14  ,103 ,134 ,45, 104, 139, 43 ,119 ,80 ,84, 76, 80, 144, 125, 39, 5 ,118, 64 ,137, 12, 50 ,122 ,58, 140, 58, 6 ,49, 67, 9, 55, 14, 94, 109, 76 ,114, 115, 130, 120 ,83, 121, 58 ,6 ,101, 52, 56 ,63, 70, 26, 55, 64, 84, 65, 52, 112 ,116, 100};
           System.out.println(Arrays.toString( mergeSort(arr,0,arr.length-1)));
    }
}
