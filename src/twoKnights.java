import java.util.Scanner;
public class twoKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        for(long n = 1; n <= k; n++) {
//            long totalWays = ((n * n) * (n * n - 1)) / 2;
//            long canNotGO = (4 * (n - 1) * (n - 2));
            System.out.println(((n * n) * (n * n - 1)) / 2 - (4 * (n - 1) * (n - 2)));
        }
    }
}
