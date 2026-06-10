package SubsetSubsequenceStrings;

import java.util.*;

public class ReturnArrayListOfSubsetsWithoutPassingArguments 
{
    public static void main(String[] args) 
    {
        String str = "abc";
        String ans = "";
        System.out.println(AllItems(str,ans));

    }

    static ArrayList<String> AllItems(String str , String ans)
    {
        if(str.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = AllItems(str.substring(1), ans + ch);
        ArrayList<String> right = AllItems(str.substring(1), ans);

        left.addAll(right);
        return left;

    }
}
