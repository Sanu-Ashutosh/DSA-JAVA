import java.util.*;
class A{
  int a=10;
}
class B extends A{
int b=79;
}

public class ask extends B {
    int c=78;
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    System.out.println("");
     A a1=new ask();
     B b1= null;
     if(a1 instanceof B)
     {
        b1=(B)a1;
     }
     if(a1 instanceof B)
     {
       
       ask a2=(ask)b1;
       
     } 

     ask a3=new ask();
     
    }
}