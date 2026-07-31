package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode2828 
{
    public static void main(String[] args) 
    {
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charile");
        System.out.println(isAcronym(words, "abc"));
    }

    public static boolean isAcronym(List<String> words, String s) 
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words.size();i++)
        {
            sb.append(words.get(i).charAt(0));
        }
        return s.equals(sb.toString());
    }
}
