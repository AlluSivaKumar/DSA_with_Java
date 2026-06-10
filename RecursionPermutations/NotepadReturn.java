package RecursionPermutations;

import java.util.ArrayList;
import java.util.List;

public class NotepadReturn 
{
    public static void main(String[] args) 
    {
        List<String> answers = pad("12", "");
        for(String ans : answers)
        {
            System.out.println(ans);
        }
    }

    static List<String> pad(String num,String ans)
    {
        //Base Condition
        if(num.isEmpty())
        {
            //Creating a list to add existing answer list
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        //Creating a list to add all answers
        List<String> list = new ArrayList<>();

        //to take first digit in a number Srring
        int digit = num.charAt(0) - '0';

        //loop for characters the range of any number
        for(int i = (digit-1)*3 ; i < digit*3 ; i++)
        {
            //character at that digit will add to digit string number
            char ch = (char)('a' + i);
            list.addAll(pad(num.substring(1), ans + ch));
        }

        return list;
    }
}
