import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n == 2 || n == 3){
            System.out.println("NO SOLUTION");
            return;
        }
        //o/p for even number 1st
        for(long i = 2;i <= n;i += 2) {
            System.out.print(i+ " ");
        }
        //then o/p all the odd number
        for(long i = 1;i <= n;i += 2) {
            System.out.print(i+ " ");
        }
    }
}
