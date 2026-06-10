package LeetCode;

import java.util.HashSet;

public class LeetCode205 {
    public static void main(String[] args) 
    {
        System.out.println(isIsomorphic("add", "egg"));
    }


    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }

        for(int j=0;j<t.length();j++)
        {
            set2.add(t.charAt(j));
        }

        return set.size() == set2.size();
    }

}
