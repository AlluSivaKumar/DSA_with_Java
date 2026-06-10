package RecursionPermutations;

import java.util.ArrayList;
import java.util.List;

public class ReturnArrayList 
{
    public static void main(String[] args) 
    {
        String str = "abcde";
        String ans = "";
        List<String> list = permutationsreturn(str, ans);
        for(String answers : list)
        {
            System.out.println(answers);
        }
    }

    static List<String> permutationsreturn(String str,String ans)
    {
        if(str.isEmpty())
        {
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        //local to this call
        List<String> NewList = new ArrayList<>();

        for(int i=0; i<=ans.length(); i++)
        {
            String left = ans.substring(0,i);
            String right = ans.substring(i,ans.length());
            NewList.addAll(permutationsreturn(str.substring(1), left + ch + right));
        }

        return NewList;
    }
}
