import java.util.HashSet;

public class subarrayEqualSum {

    public static boolean findSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if(!set.add(sum)) {
                return true;
            }
            for(int num : set) {
                System.out.println(num + " ");
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 4};
//        int[] nums = {1, 2, 3, 4, 5};
        findSubarrays(nums);
    }
}
