import java.util.*;
public class rightRotate {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int n = nums.length;
        int k = 2;
        k = k % n;
        int[] temp = new int[k];
        for(int i = n - k; i < n; i++) {
            temp[i - (n - k)] = nums[i];
        }
        for(int i = n - k - 1; i >= 0 ; i--) {
            nums[i + k] = nums[i];
        }
        for(int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        for(int i = 0; i < n; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
