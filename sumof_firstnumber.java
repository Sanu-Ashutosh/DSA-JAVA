import java.util.*;

public class sumof_firstnumber {
    static int i=0;
    static int count;

    public static int name(int n) {
        if(i==n) return count;
        count=count+n;
        n--;
        name(n);
        return count;
    }
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println(name(6));
    }
}