import java.util.Scanner;

public class B8PalindromeOrNot 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to check :");
        String str = sc.nextLine();
        String newStr ="";
        for(int i=str.length()-1 ; i>=0 ; i--) 
        {
            newStr += str.charAt(i);
        }
        System.out.println(newStr);

        if(str.equals(newStr))
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not palindrome.");
        }
        sc.close();
    }
}
