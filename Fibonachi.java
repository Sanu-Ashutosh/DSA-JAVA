import java.util.*;

public class Fibonachi {
    public static int fib(int n) {
        if (n < 1)
            return 0;
        if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static void printSerise(int n) {
        int a=0,b=1,c=0;
        int i=0;
        while(i<=n)
        {
            c=a+b;
            if(a==0) System.out.print("Fibonachy series"+a+" ");
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Any number : ");
        int n = s.nextInt();
        System.out.println(fib(n));
        printSerise(n);
       

    }
}