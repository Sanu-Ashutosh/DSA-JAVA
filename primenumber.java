import java.util.*;

public class primenumber {
    public static boolean isPrime(int num) {
		//Your code goes here
        for (int i = 2; i <=num/2; i++) {
            if(num%i==0) return false;
        }
        return true;
	}
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println( isPrime(41));
    }
}