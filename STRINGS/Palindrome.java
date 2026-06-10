package STRINGS;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));

        sc.close();
    }

    public static boolean isPalindrome(String str)
    {
        if(str == null || str.length() <= 1)
        {
            return true;
        }
        String revStr = Reverse.reverseAString(str);

        return str.equals(revStr);
    }

    public static boolean isPalindrome2(String str)
    {
        if(str == null || str.length() <= 1)
        {
            return true;
        }
        int left = 0;
        int right = str.length()-1;

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
}
