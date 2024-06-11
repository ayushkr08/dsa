package StackAndQueues;

import java.util.Stack;

public class implementQueue {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);

        System.out.println(stack.pop());

    }
}

class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }
    public int remove() throws Exception {
        while(!first.isEmpty()) {
            int popped = first.pop();
            second.push(popped);
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception{
        while(!first.isEmpty()) {
            int peeked = first.pop();
            second.push(peeked);
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}
