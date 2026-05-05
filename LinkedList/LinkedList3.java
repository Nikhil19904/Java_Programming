public class LinkedList3 {
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

        // base case
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
        // base case
        if (head == null) {
            System.out.println("LL is empty");
        }

        head = head.next;
    }

    // removeLast
    // print the LinkedList
    public void print() {
        // base case
        if (head == null)
            return;

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");

    }

    // size of Linkedlist
    public int size() {
        int size = 0;

        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }

    // search in linkedlist
    public int search(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;

        }
        return i;
    }

    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
        list.addFirst(40);
        list.addFirst(30);
        list.addFirst(20);
        list.addLast(10);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);

        list.print();

        System.out.println(list.size());

    }
}