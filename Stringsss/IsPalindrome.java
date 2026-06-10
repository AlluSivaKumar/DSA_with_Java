package Stringsss;

public class IsPalindrome {
    public static void main(String[] args) {
        String name = "KABCDDCBAK";
        System.out.println(isPalindrome(name));
    }

    static boolean isPalindrome(String str)
    {
        String newStr = str.toLowerCase();
        boolean value = false;
        
        for(int i=0;i<newStr.length()/2;i++)
        {
            if(newStr.charAt(i) == newStr.charAt(newStr.length()-1-i))
            {
                value = true;

            }
            else
            {
                return false;
            }
        }
        return value;
    }
}
