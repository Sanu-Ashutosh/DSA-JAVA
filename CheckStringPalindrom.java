import java.util.*;

public class CheckStringPalindrom {
    static int i;
    public static boolean rev(String a) {
      if(i>=a.length()) return true;
      if(a.charAt(i)!=a.charAt(a.length()-1-i)) return false;
      i++;
        return rev(a);

    }

    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any string");
    boolean check=rev(s.nextLine());
    if(check)  System.out.println("Its a palindrom number.");
    else System.out.println("Its a palindrom number.");
    }
}