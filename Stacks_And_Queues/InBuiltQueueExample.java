package Stacks_And_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(45);
        queue.add(34);
        queue.add(23);
        queue.add(13);

        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        System.out.println(queue);
    }
}
