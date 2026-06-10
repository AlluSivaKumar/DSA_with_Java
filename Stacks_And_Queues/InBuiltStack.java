package Stacks_And_Queues;

import java.util.*;

class InBuiltStack
{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(56);
        stack.push(12);
        stack.push(78);
  
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        

        System.out.println(stack);


    }
}