package LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCode242 
{
    public static void main(String[] args) 
    {
        String  s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public boolean isAnagram2(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int i = 0;
        while(i < sArray.length)
        {
            if(sArray[i] != tArray[i])
            {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set.add(s.charAt(i));
        }

        for(int i=0;i<t.length();i++)
        {
            if(!set.contains(t.charAt(i)))
            {
                return false;
            }
        }
        return true; 
    }
}
