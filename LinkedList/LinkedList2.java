public class LinkedList2 {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // addFirst
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // removeFirst
    public void removeFirst() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        head = head.next;

        if (head == null) { // list became empty
            tail = null;
        }
    }

    // removeLast
    public void removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        if (head.next == null) {
            head = tail = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    // print
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // size of the LinkedList
    public int size() {
        int size = 0;
        if (head == null) {
            return 0;
        }

        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;

        }
        return size;
    }

    // iterative serarch
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);

        list.print();

        // System.out.println(list.iterativeSearch(4));
        System.out.println("The size of the List is : " + list.size());

    }
}