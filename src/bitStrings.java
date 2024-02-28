import java.util.Scanner;
public class bitStrings {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(power(2, n));

    }
    static long power(long base, long expo) {
        long ans = 1;
        while (expo > 0) {
            if ((expo & 1) == 1) {
                ans = (ans * base) % MOD;
            }
            base = (base * base) % MOD;
            expo >>= 1;
        }
        return ans;
    }
}
