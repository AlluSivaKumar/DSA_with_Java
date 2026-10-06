package LeetCode;

import java.util.Stack;

public class LeetCode921 {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == ')' && stack.size() >= 1)
            {
                if(stack.peek() == '(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
            else
            {
                stack.push(ch);
            }
            System.out.println(stack);
        }
        return stack.size();
    }

    public static void main(String[] args) {
        String s = "((())";
        System.out.println(minAddToMakeValid(s));
    }
}
