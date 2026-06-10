package LeetCode;

class LeetCode125
{
    public static void main(String[] args)
    {
        String s =  "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str) 
    {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(Character.toLowerCase(ch));
            }
        }

        StringBuilder sb2  = new StringBuilder();
        sb2.append(sb);

        sb2.reverse();

        return sb.toString().equals(sb2.toString());
    }
}