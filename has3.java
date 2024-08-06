import java.util.*;

//Using map collection

public class has3 {

    public static void countFreq(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + "\t" + i.getValue());

        }

        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (Map.Entry<Integer,Integer> i : map.entrySet()) {
            int count=i.getValue();
            int element=i.getKey();
            if(count>maxFreq)
            {
                maxEle=element;
                maxFreq=count;
            }
            if(count<minFreq)
            {
                minEle=element;
                minFreq=count;
            }
            
        }
        System.out.println("Min freq element is "+minEle+" "+minFreq+"times.");
        System.out.println("MAX freq element is "+maxEle+" "+maxFreq+"times.");

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,11, 11, 2, 7, 5, 6, 4, 2, 3, 5, 3, 4, 2, 5, 5, 3,13 };
        int n = arr.length;
        countFreq(arr, n);
    }

}

// static void Frequency(int arr[], int n)
// {
// Map<Integer, Integer> map = new HashMap<>();

// for (int i = 0; i < n; i++)
// {
// if (map.containsKey(arr[i]))
// {
// map.put(arr[i], map.get(arr[i]) + 1);
// }
// else
// {
// map.put(arr[i], 1);
// }
// }
// // Traverse through map and print frequencies
// for (Map.Entry<Integer,Integer> entry : map.entrySet())
// {
// System.out.println(entry.getKey() + " " + entry.getValue());
// }
// }