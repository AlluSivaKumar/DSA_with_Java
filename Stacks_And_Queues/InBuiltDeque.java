package Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(45);
        deque.add(23);

        deque.addFirst(12);
        deque.addLast(67);

        System.out.println(deque.peek());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}
