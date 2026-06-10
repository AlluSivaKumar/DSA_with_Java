package LeetCode;

import java.util.Arrays;

public class LeetCode383 {
    public static void main(String[] args) 
    {
        String ransomNote = "aa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) 
    {
        char[] ransomeNote1 = ransomNote.toCharArray();
        char[] magazine1 = magazine.toCharArray();

        Arrays.sort(ransomeNote1);
        Arrays.sort(magazine1);

        String magazine2 = new String(magazine1);
        String ransomNote2 = new String(ransomeNote1);
        return magazine2.contains(ransomNote2);
    }
}