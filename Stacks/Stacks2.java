// package Stacks;

import java.util.*;

public class Stacks2 {
    public static void reverse(Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    private static void pushAtBottom(int data, Stack<Integer> s) {

        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // reverse the stack
        reverse(s);

        // print stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
