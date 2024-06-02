package stack;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(34);
//        stack.push(9);
//        stack.push(1);
//        stack.push(10);
//        stack.push(12);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(6);
//        queue.add(5);
//        queue.add(19);
//        queue.add(1);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(34);
        deque.addLast(32);
        deque.addFirst(344);
    }
}
