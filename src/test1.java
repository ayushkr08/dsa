import java.util.*;
public class test1 {
    public static void main(String[] args) {
        //String str = "ABba";

        String str = "xabaz";

        str = str.toLowerCase();

        System.out.println(isPali(str));

    }
    public static boolean isPali(String str) {
        //Naive approach
//        String rev = "";
//        for(int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if(str.equals(rev)) {
//            return true;
//        } else{
//            return false;
//        }

        //Better approach
//        int i = 0;
//        int j = str.length() - 1;
//        while(i < j) {
//            if(str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;

        // recursive approach
        //base condition
        if(str.length() <= 1) {
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        //return isPali(str.substring(1, str.length() - 1));
        return isPali(str.substring(2,4));
    }
}
