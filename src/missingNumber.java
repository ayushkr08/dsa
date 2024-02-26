import java.util.Scanner;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        //System.out.println(n);
        long sum = 0;
        for(long i=0;i<n-1;i++){
            long num = sc.nextInt();
            //System.out.print(num + " ");
            sum = sum + num;
        }
        System.out.println((n * (n + 1)/2)-sum);
    }
}
