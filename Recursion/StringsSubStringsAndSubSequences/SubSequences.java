package Recursion.StringsSubStringsAndSubSequences;

public class SubSequences 
{
    public static void allSubSequences(String p , String up)
    {
        if(up.isBlank())
        {
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);

        allSubSequences(p + ch, up.substring(1));
        allSubSequences(p, up.substring(1));
    }
    public static void main(String[] args) 
    {
        allSubSequences("", "abc");
    }
}
