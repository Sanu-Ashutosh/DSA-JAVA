import java.util.*;

public class palindromnum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int n=num;
        int a=Integer.parseInt("89");
        int orgNum=0;
        while(num>0)
        {
            int r=num%10;
            orgNum=(orgNum*10)+r;
            num/=10;
        }
        System.out.println(orgNum);
        if(orgNum==n) System.out.println("true");
        else System.out.println("false");
    }
}