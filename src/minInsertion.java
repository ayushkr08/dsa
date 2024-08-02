import java.util.Stack;

public class minInsertion {
    public static int minInsertion(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(c);
            }
            else{
                if(i + 1 < s.length() && s.charAt(i + 1) == ')'){
                    i++;
                }
                else {
                    count++;
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    count++;
                }
            }
        }
        count += 2 * stack.size();
        return count;
    }

    public static void main(String[] args) {
        String s = "(()))";
        System.out.println(minInsertion(s));
    }
}
