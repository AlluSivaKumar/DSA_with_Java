package LeetCode;

public class LeetCode3110 
{
    public static void main(String[] args) 
    {
        String str = "hello";
        System.out.println(scoreOfString(str));
    }

    public static int scoreOfString(String s) 
    {
        int score = 0;

        for(int i=1;i<s.length();i++)
        {
            score += Math.abs((int)((int)(s.charAt(i)-'0') - (int)(s.charAt(i-1) - '0')));
        }

        return score;
    }
}