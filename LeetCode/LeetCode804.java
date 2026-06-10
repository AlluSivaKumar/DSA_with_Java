package LeetCode;

import java.util.HashSet;

public class LeetCode804 {
    public static void main(String[] args) {
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(uniqueMorseRepresentations(words));
        
    }

    public static int uniqueMorseRepresentations(String[] words) 
    {
        HashSet<String> ans = new HashSet<>();
        for(int i=0; i<words.length; i++)
        {
            String str = StrWord(words[i]);
            ans.add(str);
        }
        return ans.size();
    }

    public static String StrWord(String str)
    {
        StringBuilder sb = new StringBuilder();

        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };

        for(char ch : str.toCharArray())
        {
            sb.append(morse[ch- 'a']);
        }
        String ans = sb.toString();
        return ans;
    }
}
