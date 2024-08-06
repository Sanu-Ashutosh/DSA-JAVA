import java.util.*;

public class factofanum {
   
    public static int fact(int n) {
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println(fact(3));
    }
}