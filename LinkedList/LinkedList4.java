public class LinkedList4 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // add at head
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // palindrome check
    public boolean palindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        // 1. find middle
        Node mid = findMid(head);

        // 2. reverse second half
        Node secondStart = reverse(mid.next);

        // break list
        mid.next = null;

        // 3. compare
        Node first = head;
        Node second = secondStart;

        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    // find middle
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // reverse list
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {

        LinkedList4 list = new LinkedList4();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);

        System.out.println(list.palindrome(list.head));
    }
}