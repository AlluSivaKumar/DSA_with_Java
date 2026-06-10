package SubsetSubsequenceStrings;

import java.util.ArrayList;

public class SubsetsInStringWithArgumentAsLList 
{
    public static void main(String[] args) 
    {
        String str = "abc";
        String ans = "";
        ArrayList<String> list = new ArrayList<>();
        subsets(str,ans,list);
        System.out.println(list);
    }

    static void subsets(String str,String ans,ArrayList<String> list)
    {
        if(str.isEmpty())
        {
            list.add(ans);
            return;
        }

        char ch = str.charAt(0);

        subsets(str.substring(1), ans+ch,list);
        subsets(str.substring(1), ans,list);
    }
}
