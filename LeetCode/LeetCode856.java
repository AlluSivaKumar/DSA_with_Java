package LeetCode;

import java.util.Stack;

public class LeetCode856 
{
    public static void main(String[] args) 
    {
        String s = "(()(()))";
        System.out.println(scoreOfParentheses(s));
    }
    public static int scoreOfParentheses(String s) 
    {
        int score = 0;
        int totalScore = 0;
        int internalScore = 0;

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '(')
            {
                stack.push(ch);
                internalScore = stack.size();
            }
            else
            {
                stack.pop();
                score = internalScore;
                totalScore = totalScore + score;
            }

        }

        return totalScore;
    }
}
