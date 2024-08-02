import java.util.Stack;

public class MinAddToMakeValid {
    public int minAdd(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char ch : s.toCharArray()) {
            if(ch == ')') {
                if(!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
