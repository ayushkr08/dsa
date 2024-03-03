import java.util.Scanner;
public class increasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long[] values = new long[(int) n];
        long answer = 0;
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextLong();
        }
        for (int i = 1; i < n; i++) {
            if (values[i] < values[i - 1]) {
                answer += (values[i - 1] - values[i]);
                values[i] = values[i - 1];

            }
        }
        System.out.println(answer);

    }
}


