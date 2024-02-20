public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,2,3,1};
        System.out.println(ans(arr));
    }
    public static int ans(int[] arr) {
        int unique = 0;
        for(int i = 0;i< arr.length;i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}
