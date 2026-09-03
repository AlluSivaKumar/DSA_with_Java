package Stacks_And_Queues;

import java.util.Stack;

public class QueueUsingStacks 
{
    Stack<Integer> first;
    Stack<Integer> second;

    public QueueUsingStacks() 
    {
        first = new Stack<>();
        second =  new Stack<>();
    }

    //INSERT ITEM
    public void push(int item)
    {
        first.push(item);
    }


    //POP ITEM
    public int pop()
    {
        while (!first.isEmpty()) 
        {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) 
        {
            first.push(second.pop());
        }

        return removed;
    }

    public boolean isEmpty()
    {
        return first.isEmpty();
    }

    public int peek()
    {
        while (!first.isEmpty()) 
        {
            second.push(first.pop());
        }

        int peek = second.peek();

        while (!second.isEmpty()) 
        {
            first.push(second.pop());
        }

        return peek;
    }
    

    public static void main(String[] args) 
    {
        QueueUsingStacks queue = new QueueUsingStacks();

        queue.push(67);
        queue.push(78);
        queue.push(12);
        queue.push(89);

        System.out.println(queue);

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue);
    }
}
