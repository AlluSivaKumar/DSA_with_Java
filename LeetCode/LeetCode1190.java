package LeetCode;

import java.util.Stack;

public class LeetCode1190 {
    public static void main(String[] args) 
    {
        String str = "(u(love)i)";
        System.out.println(reverseParentheses(str));
    }

    public static String reverseParentheses(String s) 
    {
        Stack<StringBuilder> stack = new Stack<>();

        StringBuilder current = new StringBuilder("");

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(current);
                current = new StringBuilder();
            }
            else if(s.charAt(i) == ')')
            {
                current.reverse();

                StringBuilder previous = stack.pop();
                previous.append(current);

                current = previous;
            }
            else
            {
                current.append(s.charAt(i));
            }
        }

        return current.toString();

        /* Stack<String> stack = new Stack<>();

        String current = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(current);
                current = "";
            }

            else if(s.charAt(i) == ')')
            {
                String revStr = reverse(current);
                String additive = stack.pop();
                current = additive + revStr;
            }
            else
            {
                current = current + s.charAt(i);
            }
        }

        return current; */
    }

    public static String reverse(String str)
    {
        StringBuilder sb = new StringBuilder();

        char[] arr = str.toCharArray();
        int start = 0 , end = arr.length-1;
        while (start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
