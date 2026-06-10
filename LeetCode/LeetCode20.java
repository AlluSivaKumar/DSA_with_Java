package LeetCode;

import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) 
    {
        String s = "[";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(ch =='(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }

                if(ch == ')')
                {
                    if(stack.pop() != '(')
                    {
                        return false;
                    }
                }
                else if(ch == '}')
                {
                    if(stack.pop() != '{')
                    {
                        return false;
                    }
                }
                else if(ch == ']')
                {
                    if(stack.pop() != '[')
                    {
                        return false;
                    }
                }
            }
        }

        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}