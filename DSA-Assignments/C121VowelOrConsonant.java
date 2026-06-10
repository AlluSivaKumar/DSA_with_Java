
import java.util.Scanner;

public class C121VowelOrConsonant 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet : ");
        String str = sc.nextLine().toLowerCase();

        if(str.equals("a") ||
           str.equals("e") || 
           str.equals("i") || 
           str.equals("o") ||
           str.equals("u"))
        {
            System.out.println(str + " - is a Vowel.");
        }
        else
        {
            System.out.println(str + " - is a consonant.");
        }
    }
}
