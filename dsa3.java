import java.util.*;

public class dsa3 {
    public static void alphaHill(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(ch);
                if (k <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("");
        int n = s.nextInt();
        alphaHill(n);
         //\u000dSystem.out.println("Hi tumri fellow");
         int i12 = \u0031;
		
	
		
    }
}