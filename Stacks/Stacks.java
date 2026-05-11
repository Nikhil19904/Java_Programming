import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // push opearation-O(1)
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s); // print the stack

        // pop-O(1)
        s.pop();
        System.out.println(s);

        System.out.println(s.peek()); // peek-O(1)
        System.out.println(s.size()); // size of the stack

        System.out.println(s.isEmpty()); // stack is empty or not

    }
}