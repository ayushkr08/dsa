public class setBits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(SetBits(n));
    }
    private static int SetBits(int n) {
        int count = 0;

//        while (n > 0) {
//            count++;
//            n -= (n & -n);
//        }
//          OR
//        while (n > 0) {
//            count++;
//            n = n & (n-1);
//        }
        // OR
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
