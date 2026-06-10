package LeetCode;

public class LeetCode389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }

    public static char findTheDifference(String s, String t) 
    {
        char xor = 0;

        for(char ch : s.toCharArray())
        {
            xor = (char) (xor ^ ch);
        }

        for(char ch : t.toCharArray())
        {
            xor = (char) (xor ^ ch);
        }

        return xor;
    }
}

