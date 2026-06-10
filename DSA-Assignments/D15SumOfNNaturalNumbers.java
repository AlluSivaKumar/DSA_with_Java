
import java.util.Scanner;

public class D15SumOfNNaturalNumbers 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();

        System.out.println("The sum till " + n + " is : " + sum(n));
    }

    static int sum(int n)
    {
        int sum = 0;

        for(int i=0; i<=n ; i++)
        {
            sum += i;
        }

        return sum;
    }
}
