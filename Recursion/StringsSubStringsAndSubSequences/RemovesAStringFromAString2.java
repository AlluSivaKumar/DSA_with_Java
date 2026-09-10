package Recursion.StringsSubStringsAndSubSequences;

public class RemovesAStringFromAString2 
{
    public static void skip(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        if(up.startsWith("apple"))
        {
            skip(p, up.substring(5));
        }
        else
        {
            skip(p + up.charAt(0) , up.substring(1));
        }
    }
    public static void main(String[] args) 
    {
        skip("", "Ihaveananappleandtomato");
    }
}
