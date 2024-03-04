public class majorityElements {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElem(nums));
    }
    public static int majorityElem(int[] nums) {
        int ans = nums[0];
        for(int i = 1;i < nums.length;i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
