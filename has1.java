import java.util.*;

public class has1 {
     //int haas[]=new int[1000000000+1];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("LEngth of arr");
        int n = s.nextInt();
        System.out.println("Enter elements to array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int has[]=new int[1000000];
        for(int i=0;i<n;i++) 
        {
            has[arr[i]]++;
        }
        System.out.println("Full length");
        int a=s.nextInt();
        while(a-- !=0)
        {
            System.out.println("Enter to find");
            int number=s.nextInt();
            System.out.println(has[number]);
          
        }


    }
}