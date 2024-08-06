import java.util.*;

public class dsa1 {

    public class Solution {
        public static Long factorialNumbers(Long n) {
            // Write Your Code Here
            if(n==0) return n;
            return n*(factorialNumbers(n-1));
    
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size: ");
        long n=s.nextLong();
       System.out.println(factorialNumbers(n));
    }
}
}