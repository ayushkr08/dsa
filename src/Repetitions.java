import java.util.Scanner;
public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        long max = 1;
        for(int i=0;i<st.length()-1;) {
            int count = 1;
            char ch = st.charAt(i);
            for(int j = i+1;j < st.length();j++) {
                if(ch == st.charAt(j)){
                    count++;
                } else {
                    break;
                }
            }
            if(count >= max) {
                max = count;
            }
            i = i + count;
        }
        System.out.println(max);
    }
}
