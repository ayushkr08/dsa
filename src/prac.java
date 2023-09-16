import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
       String str = "pneumonia";
       int n = 4;
       System.out.println(compute(str,n));
    }
    static String compute(String str, int n){
        String rev = "zyxwvutsrqponmlkjihgfedcba";
        int l = str.length();
        String ans = "";
        for(int i=0;i<n;i++){
            ans = ans + str.charAt(i);
        }
        for(int i=n;i<str.length();i++){
            ans = ans + rev.charAt(str.charAt(i)-'a');
        }
        return ans;
    }


}


