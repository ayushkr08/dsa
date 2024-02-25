public class powerOfTwo {
    public static void main(String[] args) {
        int n = 6;
        int count = 0;
//        while(n > 0) {
//            count += n & 1;
//            n >>= 1;
//        }
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println(count);
        if(count == 1) {
            System.out.println("the number is power of 2");
        } else {
            System.out.println("the number is not the power of 2");
        }
    }
}
