package RecursionPermutations;

public class LetterCombinationsKeypad 
{
    public static void main(String[] args) 
    {
        pad("12","");
    }

    static void pad(String digits,String ans)
    {
        if(digits.isEmpty())
        {
            System.out.println(ans);
            return;
        }

        int digit = digits.charAt(0)-'0';//converting this into number

        for(int i=((digit-1)*3); i < digit*3 ; i++)
        {
            char ch = (char) ('a' + i);
            pad(digits.substring(1), ans + ch);
        }
    }
}
