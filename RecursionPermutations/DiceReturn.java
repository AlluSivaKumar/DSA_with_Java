package RecursionPermutations;

import java.util.*;

public class DiceReturn 
{
    public static void main(String[] args) 
    {
        List<String> ans = dice(4, "");
        for(String answers : ans)
        {
            System.out.println(answers);
        }
    }

    static List<String> dice(int target, String ans)
    {
        if(target == 0)
        {
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        List<String> list = new ArrayList<>();

        for(int i=1 ; i<=6 && i<=target ; i++)
        {
            list.addAll(dice(target - i, ans + i));
        }

        return list;
    }
}
