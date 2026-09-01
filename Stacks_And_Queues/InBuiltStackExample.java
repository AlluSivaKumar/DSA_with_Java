package Stacks_And_Queues;

import java.util.Stack;

class InBuiltStackExample
{
    public static void main(String[] args) 
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(67);
        stack.push(34);
        stack.push(12);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}