import java.util.Scanner;

public class C117PalindromeOrNot 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings({ "unused", "resource" })
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        String rev = "";
        
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
