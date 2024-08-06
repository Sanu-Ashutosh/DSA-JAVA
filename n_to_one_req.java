public class n_to_one_req{
    static int i=0;
    public static void name1(int n,String name) {
        if(n==0) return;
        System.out.println(n+" "+name);
        n--;
        name1(n,name);
        
    }
    public static void main(String[] args) {
         name1(5,"sanu");
    }
}
