public class one_tonusingreq {
    static int i=1;
    public static void printNos(int x) {
        // Write Your Code Here
        if(i==x+1) return;
        System.out.println(i);
        i++;
        printNos(x);
        
       
    }
    public static void main(String[] args) {
       printNos(5);
    }
}
