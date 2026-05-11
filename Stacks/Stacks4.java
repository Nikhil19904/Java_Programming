// package Stacks;

import java.util.*;

public class Stacks4 {

    // Insert element in sorted position
    public static void sortedInsert(Stack<Integer> s, int data) {

        // Base case:
        // stack empty OR top <= data
        if (s.isEmpty() || s.peek() <= data) {
            s.push(data);
            return;
        }

        // Remove top
        int top = s.pop();

        // Insert deeper
        sortedInsert(s, data);

        // Restore top
        s.push(top);
    }

    // Sort whole stack
    public static void sortStack(Stack<Integer> s) {

        // Base case
        if (s.isEmpty()) {
            return;
        }

        // Remove top
        int top = s.pop();

        // Sort remaining stack
        sortStack(s);

        // Insert popped element in correct place
        sortedInsert(s, top);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);

        sortStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}