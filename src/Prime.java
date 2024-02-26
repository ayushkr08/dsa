import static java.lang.Math.sqrt;

public class Prime {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }

    }
    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        //int c = 2;
        // while(c <= sqrt(n))---> squaring both side(to keep things simple)
//        while(c * c <= n) {
//            if(n % c == 0) {
//                return false;
//            }
//            c++;
//        }
        for(int i = 2;i <= sqrt(n);i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
 }
