import java.util.*;

public class similarString {
    public static void main(String[] args) {
        String str1 = "ceb";
        String str2 = "acer";
        System.out.println(similar(str1));
        if(similar(str1) == similar(str2)) {
            System.out.println("They are similar string");
        } else {
            System.out.println("Not a similar string");
        }


    }
    private static int similar(String str) {
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            int mask = str.charAt(i) - 'a';
            int temp = 1;
            ans |= temp << mask;
        }
        return ans;
    }
}
