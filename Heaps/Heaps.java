import java.util.*;

public class Heaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(30);
        pq.offer(20);
        pq.offer(10);

        System.out.println(pq.peek());

        pq.poll();

        System.out.println(pq.peek());

    }
}