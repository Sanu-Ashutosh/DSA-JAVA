import java.util.Scanner;

public class practics {
    public static int countDigits(int n) {
        // Write your code here.
        int num=0;
      while(n>0)
      {
          int r=n%10;
          num=(num*10)+r;
          n/=10;
      }
      return num;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(countDigits(s.nextInt()));
    }
}
