import java.util.Stack;
public class validParent {
    public static boolean isValid(String s) {
        // () {} []
        // stack -->  | ( |
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if(ch == ')') {
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if(ch == '}') {
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if(ch == ']') {
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "){}";
        System.out.println(isValid(s));
    }

}
