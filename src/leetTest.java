import java.util.*;

public class leetTest {
    public static void main(String[] args) {
        int[] nums = {5,5,5,25};
        int singleSum = 0;
        int doubleSum = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 10)  {
                singleSum = singleSum + nums[i];
            } else {
                doubleSum = doubleSum + nums[i];
            }
        }
        if(singleSum < doubleSum || singleSum > doubleSum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
    public static boolean singleDigit(int num) {
        if((num / 10) < 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean doubleDigit(int num) {
        if((num / 10) > 1) {
            return true;
        } else {
            return false;
        }
    }
}
