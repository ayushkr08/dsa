public class linked {
    private Node head;
    private Node tail;
    private int size;
    //making constructor
    public linked() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index;i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    //insert using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next); 
        return node;
    }


    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print (temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public int deleteInteger() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteInteger();
        }
        if(index == size-1){
            return deleteLastElement();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public int deleteLastElement() {
        if(size <= 1) {
            return deleteInteger();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null){
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;
        for(int i = 0;i < index;i++) {
            node = node.next;
        }
        return node;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //leetcode questions
    public void duplicates() {
        Node node = head;

        while(node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // merge 2 linked list

    public static linked merge(linked first, linked second) {
        Node f = first.head;
        Node s = second.head;

        linked ans = new linked();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;

        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }


    //Recursion reverse
    private void reverse(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //in-place reversal of linked list
    public void reverse() {
        if(size < 2) {
            return;
        }
        Node prev = null;
        Node present = head;
        Node nextNode = present.next;

        while (present != null) {
            present.next = prev;
            present = nextNode;
            if(nextNode != null) {
                nextNode = nextNode.next;
            }
        }
        head = prev;
    }

    public static void main(String[] args) {
        linked first = new linked();
        linked second = new linked();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        linked ans = linked.merge(first, second);
        ans.display();


    }
}
