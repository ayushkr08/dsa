public class DLL {

    private Node head;
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
            head = null;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }
    public Node find(int value) {
        Node node = head;
        while(node != null) {
            if(node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int val) {
        Node prev_node = find(after);
        if(prev_node == null) {
            System.out.println("Does not exist");
        }
        Node node = new Node(val);
        node.next = prev_node.next;
        prev_node.next = node;
        node.prev = prev_node;
        if(node.next == null) {
            node.next.prev = node;
        }
    }


    public void display() {
        Node node = head;
        Node last = null;
        while(node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("printing reverse of the linkedlist");
        while (last != null) {
            System.out.print(last.val+ "-> ");
            last = last.prev;
        }
        System.out.println("END");
    }



    private class Node {
        int val;
        Node next;
        Node prev;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
