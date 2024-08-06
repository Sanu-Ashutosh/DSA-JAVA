import java.util.*;

public class sumofdivisor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if(i%j==0) 
                sum=sum+j;
            }
        }
        System.out.println(sum);
    }
}