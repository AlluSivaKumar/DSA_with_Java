package Recursion.StringsSubStringsAndSubSequences;

public class RemovesACharacterFromAString2 
{
    public static String skip(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

        char ch = s.charAt(0);

        if(ch != 'a')
        {
            return ch + skip(s.substring(1));
        }
        else
        {
            return skip(s.substring(1)); 
        }
    }

    public static void main(String[] args) 
    {
        System.out.println(skip("abcabcc"));
    }
}
