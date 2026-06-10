
import java.util.Scanner;

public class C101FactorialNumber 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = num; i >= 1 ; i--) 
        {
            fact = fact*i;
        }

        System.out.println("The factorial of a Given Number is :"+fact);
    }
}
