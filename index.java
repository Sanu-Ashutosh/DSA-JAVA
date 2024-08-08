import java.io.Console;

/**
 * index
 */
/**
 * Innerindex
 */
 class Innerindex {
    static int a=10;
    int b=2;
    Innerindex(double a)
    {
        System.out.println(a);
    }
    
}
public class index extends Innerindex{
   
    public index()
    {
        super(10);
    }
    public  void m1(index i)
    {
        System.out.println(super.b);
    }

    public static void main(String[] args) {
        index a1=new index();
        int a=90;
        a1.m1(a1);
    }
   
    
}