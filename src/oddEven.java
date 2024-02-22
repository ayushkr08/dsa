public class oddEven {
    public static void main(String[] args) {
        int n = 22;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n) {
        if((n & 1) == 1) {
            return true;
        }
        return false;
    }

}
