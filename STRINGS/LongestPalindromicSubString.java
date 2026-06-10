package STRINGS;

import java.util.Scanner;

public class LongestPalindromicSubString {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        System.out.println(LongestPalindromicSubstringPresent(str));
        System.out.println(LongestPalindromicSubstringPresent2(str));
        sc.close();
    }


    /* BRUTE FORCE APPROACH */
    public static String LongestPalindromicSubstringPresent(String str)
    {
        String newStr;
        String finaString = "";
        int maxlen = Integer.MIN_VALUE;
        int len;
        for(int i=0;i<str.length();i++)
        {
            newStr = "";
            len = 0;
            for(int j=i;j<str.length();j++)
            {
                newStr = newStr + str.charAt(j);
                if(isPalindrome(newStr))
                {
                    len = newStr.length();
                    if(len > maxlen)
                    {
                        maxlen = len;
                        finaString = newStr;
                    }
                }
            }
        }
        if(maxlen == Integer.MIN_VALUE)
        {
            return null;
        }
        return finaString;
    }

    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;

        if(str == null || str.length()<= 1)
        {
            return true;
        }

        while (left < right) 
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }




    /* SECOND APPROACH  */
    public static String LongestPalindromicSubstringPresent2(String s)
    {
        if (s == null || s.length() < 1) 
            return "";
        
        int start = 0, end = 0;   // will store indices of longest palindrome
        
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes (center at i)
            int len1 = expandAroundCenter(s, i, i);
            // Even length palindromes (center between i and i+1)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        return s.substring(start, end + 1);
    }


    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // length = right - left - 1 (after loop exits)
        return right - left - 1;
    }
}
