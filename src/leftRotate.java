import java.util.*;
public class leftRotate {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int n = nums.length;
        int k = 4;
        k = k % n;
        int[] temp = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for(int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }
        for(int i = n - k; i < n; i++) {
            nums[i] = temp[i - (n - k)];
        }
        for(int i = 0; i < n; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
