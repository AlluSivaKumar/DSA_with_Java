package Stacks_And_Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class InbuiltDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(45);
        deque.add(12);
        deque.add(78);

        System.out.println(deque);

        deque.addFirst(12);
        deque.addLast(98);

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}
