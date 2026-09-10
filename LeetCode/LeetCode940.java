package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class LeetCode940 {
    public static void main(String[] args) 
    {
        System.out.println(distinctSubseqII("abc"));
    }

    public static int distinctSubseqII(String s)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("");

        for(char ch : s.toCharArray())
        {
            int size = list.size();

            for(int i=0;i<size;i++)
            {
                list.add(list.get(i) + ch);
            }
        }

        HashSet<String> set = new HashSet<>();

        for(String str : list)
        {
            set.add(str);
        }
        
        return set.size() - 1;
    }

}
