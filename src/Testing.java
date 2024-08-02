import java.util.*;
public class Testing {
    public static void main(String[] args) {
        int[] num = new int[50];
        double avg = Double.MAX_VALUE;
        int[] nums = {7,8,3,4,15,13,4,1};
        int index = 0;
        for(int i = 0; i < num.length; i++) {
            num[i] = -1;
        }
        for(int i = 0; i < nums.length; i++) {
            index = nums[i];
            num[index] = index;
        }
        int left = 0;
        int right = num.length - 1;
        System.out.println("index");
        while(left < right) {
            if(num[left] == -1) {
                left++;
            } else if (num[right] == -1) {
                right--;
            } else {
                avg = Math.min(avg, (num[left] + num[right]) / 2.0);
                System.out.println((num[left] + num[right]) / 2.0);
                left++;
                right--;
            }
        }
        System.out.println(avg);

    }
}
