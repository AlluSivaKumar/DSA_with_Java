package LeetCode;

import java.util.*;

public class LeetCode500 {
    public static void main(String[] args) 
    {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) 
    {
        List<String> ans = new ArrayList<>();
        for(int i=0; i<words.length; i++)
        {
            char ch = words[i].charAt(0);
            if(String.valueOf(ch).matches("[qwertyuiopQWERTYUIOP]"))
            {
                boolean isValid = true;
                for(int j=0; j<words[i].length(); j++)
                {
                    if(!String.valueOf(words[i].charAt(j)).matches("[qwertyuiopQWERTYUIOP]"))
                    {
                        isValid = false;
                        break;
                    }
                }
                if(isValid)
                {
                    ans.add(words[i]);
                }
            }

            else if(String.valueOf(ch).matches("[asdfghjklASDFGHJKL]"))
            {
                boolean isValid = true;
                for(int j=0; j<words[i].length(); j++)
                {
                    if(!String.valueOf(words[i].charAt(j)).matches("[asdfghjklASDFGHJKL]"))
                    {
                        isValid = false;
                        break;
                    }
                }
                if(isValid)
                {
                    ans.add(words[i]);
                }
            }

            else if(String.valueOf(ch).matches("[zxcvbnmZXCVBNM]"))
            {
                boolean isValid = true;
                for(int j=0; j<words[i].length(); j++)
                {
                    if(!String.valueOf(words[i].charAt(j)).matches("[zxcvbnmZXCVBNM]"))
                    {
                        isValid = false;
                        break;
                    }
                }
                if(isValid)
                {
                    ans.add(words[i]);
                }
            }
        }

        String[] ansArray = new String[ans.size()];
        int i = 0;
        for(String word : ans)
        {
            ansArray[i] = word;
            i++;
        }

        return ansArray;
    }
}