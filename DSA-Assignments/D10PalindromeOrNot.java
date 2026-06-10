import java.util.Scanner;

public class D10PalindromeOrNot 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings({ "resource" })
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        
        palindromeNum(str, "");
    }
    

    static void palindromeNum(String str,String rev)
    {
        for (int i = str.length()-1; i >= 0; i--) 
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("It is a Palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
    }
}
