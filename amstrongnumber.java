import java.util.*;

public class amstrongnumber {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arm=n;
        int ar=0;
        while (n>0) {
            int r=n%10;
            ar=ar+(r*r*r);
            n/=10;
        }
        if(arm==ar)
            System.out.println("true");
        
        else System.out.println("false");
    }
}