package Recursion.StringsSubStringsAndSubSequences;

public class RemovesAStringFromAString 
{
    public static  String skip(String s)
    {
        if(s.isEmpty())
        {
            return "";
        }

        if(s.startsWith("apple"))
        {
            return skip(s.substring(5));
        }
        else
        {
            return s.charAt(0) + skip(s.substring(1));
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(skip("ihaveanappleforabunchapplebot"));
    }
}
