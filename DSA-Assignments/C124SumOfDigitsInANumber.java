import java.util.Scanner;

public class C124SumOfDigitsInANumber 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        while (num > 0) 
        { 
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }

        System.out.println("The sum of digits is : " + sum);
    }
}
