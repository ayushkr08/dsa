public class circularLL {

    private Node head;
    private Node tail;

    public circularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if(head != null) {
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("head");
    }


    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value = value;
        }
    }
}
