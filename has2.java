import java.util.*;

public class has2 {
    public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter String  ");
    String st=s.nextLine();
    System.out.println(st.charAt(2));

    //pre compute
    int has[]=new int[256];
    for(int i=0;i<st.length();i++)
    {
       has[st.charAt(i)]++;
    }
    
    System.out.println("Enter how many times you have search  ");
    int q=s.nextInt();
    
    while(q-- !=0)
    {
        char ch=s.next().charAt(0);
        //fetchd
        System.out.println(has[ch]);
    }
   
    }
}