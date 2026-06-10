import java.util.Scanner;

public class D9FactorialRepresentation 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        fact(num);
    }

    static void fact(int n)
    {
        int factorial = 1;
        System.out.print(n+"! = ");
        for(int i=1; i<=n; i++)
        {
            factorial *= i;
            if(i < n)
            {
                System.out.print(i +" * ");
            }
            else
            {
                System.out.print(i);
            }
        }
        System.out.print(" = "+factorial);
    }
}
