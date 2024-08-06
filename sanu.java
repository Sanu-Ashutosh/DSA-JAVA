// developa program to reverse the words available int this string "How are you";
// developa program to reverse the words available int this string "How are you";
import java.util.*;

public class sanu {
    public static void main(String [] args){
    // Scanner s = new Scanner(System.in);
    //     String s1="How are you?";
    //     String[] s2=s1.split(" ");
    //     String res="";
    //     for (int i = s2.length-1; i >=0; i--) {
    //        res=res+s2[i]+" ";
    //     }
    //     System.out.println(res.trim());
    //     System.out.println(res.trim());
    //     StringBuilder sb=new StringBuilder("sanu");
    //     System.out.println( sb.reverse());

    int arr[] = {32,32,32,5435,5646,56546};
    System.out.println(Arrays.toString(arr));
    for(int i=0;i<5;i++){
        for(int j=0; j<5-i; j++){
            System.out.print(" ");
        }

        for(int j=0; j<=i; j++){
            System.out.print("*");
        }
        // for (int j = 5-; j>0; j--) {
        //     System.out.print("*");
        // }
        System.out.println();
    }
    }
}