
import java.util.Scanner;

public class D7PrimeOrNot 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(isPrime(num))
        {
            System.out.println("It is a prime number.");
        }
        else
        {
            System.out.println("It is not a prime number.");
        }
    }

    static boolean isPrime(int n)
    {
        int count = 0;
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
            {
                count++;
            }
        }

        return count == 2;
    }
}
