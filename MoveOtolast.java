import java.util.Arrays;

public class MoveOtolast {

    public static void moveZeroes(int[] nums) {
        int j=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j=nums[i];
                break;
            }
               
        }
        for (int i = j+1; i < nums.length; i++) {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int arr[] = { 0,1,0, 2,0, 3,0, 4, 5,0 };
        moveZeroes(arr);
        System.out.println(arr.length);
    }
}
