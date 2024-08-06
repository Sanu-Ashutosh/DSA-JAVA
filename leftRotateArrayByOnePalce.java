import java.util.Arrays;

public class leftRotateArrayByOnePalce {
    public static int[] leftRotate(int s[])
    {
        int left=s[0];
       

        for (int i = 1; i < s.length; i++) {
            s[i-1]=s[i];
        }
       
        s[s.length-1]=left;
        return s;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(arr)));
    }
}
