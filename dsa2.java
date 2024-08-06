//String palindrom or not
import java.util.*;

public class dsa2 {
    static boolean reverse( String n){

        boolean pal=false;
       String a="";
       for(int i=n.length()-1;i>=0;i--)
       {
           a=a+n.charAt(i);
       }
       if(n.equals(a))
       {
           pal=true;
       }
       return pal;
    }
    

    public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number : ");
    String n=s.nextLine();
     System.out.println(reverse(n)); ;
    }
}