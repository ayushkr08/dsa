import java.util.*;
public class maxValue {
    public static void main(String[] args) {
        int[] arr = {1,3,9,23,21,5};
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length - 1]);

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);

    }
}
