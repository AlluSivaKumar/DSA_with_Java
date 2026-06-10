package LeetCode;

import java.util.Stack;

public class LeetCode682 {
    public static void main(String[] args) {
        String[] points = {"5","2","C","D","+"};
        System.out.println(calPoints(points));
    }

    public static int calPoints(String[] operations) 
    {
        Stack<Integer> stack = new Stack<>();

        for(String ch : operations)
        {
            if(ch == "C")
            {
                stack.pop();
            }
            else if(ch == "D")
            {
                stack.push(stack.peek()*2);
            }
            else if(ch == "+")
            {
                int item = stack.pop();
                int sum = stack.peek() + item;
                stack.push(item);
                stack.push(sum);
            }
            else
            {
                int k = Integer.parseInt(ch);
                stack.push(k);
            }
        }



        int sum = 0;
        for(int item : stack)
        {
            sum += item;
        }

        return sum;
    }
}
