import java.util.*;

public class RevuUingCollection {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
 
        // populate the vector
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // printing the vector before swap
        System.out.println("Before swap: " + arr);

        // swap the elements
        System.out.println("\nSwapping 0th and 4th element.");
        Collections.swap(arr, 0, arr.size()-1);

        // printing the vector after swap
        System.out.println("\nAfter swap: " + arr);
    }
}
