import java.util.HashSet;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int i = 0;
        int j = 0;
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while(i < n && j < n) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, (j - i));
//                if((j - i) > maxLength) {
//                    maxLength = (j - i);
//                    start = i;
//                    end = j;
//                }
            } else {
                set.remove(s.charAt(i++));
            }
        }
//        return s.substring(start, end);
        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        //String longest = lengthOfLongestSubstring(s1);
        System.out.println(lengthOfLongestSubstring(s1));
        //System.out.println("length of the longest substring: " + longest.length());
    }
}
