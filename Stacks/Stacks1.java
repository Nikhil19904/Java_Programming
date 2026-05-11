// package Stacks;

import java.util.*;

public class Stacks1 {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // top element remove kro
        int top = s.pop();

        // recursively niche jao
        pushAtBottom(data, s);

        // removed element ko wapas push kro
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // bottom me 5 insert karna
        pushAtBottom(5, s);

        // print stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

    }
}
