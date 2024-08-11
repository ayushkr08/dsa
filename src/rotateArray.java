import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 4;
        int n = nums.length;


        // RIGHT ROTATE
//        //reverse the whole array
//        reverse(nums, 0, n - 1);
//        //reverse till k elements
//        reverse(nums, 0, k - 1);
//        //then reverse rest of the elements
//        reverse(nums, k, n - 1);

        // LEFT ROTATE
        //reverse the 1st k elements
        reverse(nums, 0, k - 1);
        //reverse the n-k elements
        reverse(nums, k, n - 1);
        //reverse the whole array
        reverse(nums, 0, n - 1);

        for(int num : nums) {
            System.out.print(" " +  num);
        }
    }


    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
