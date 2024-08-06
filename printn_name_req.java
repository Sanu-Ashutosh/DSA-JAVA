public class printn_name_req {
    static int i=0;
    public static void name1(int n,String name) {
        if(i==n) return;
        System.out.println(i+" "+name);
        i++;
        name1(n,name);
        
    }
    public static void main(String[] args) {
         name1(5,"sanu");
    }
}
