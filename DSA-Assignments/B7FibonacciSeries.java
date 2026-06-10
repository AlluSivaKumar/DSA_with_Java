import java.util.Scanner;

public class B7FibonacciSeries 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fibonacci terms you want : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if (n <= 0) 
        {
            System.out.println("Please enter a positive number.");
        } 
        else if (n == 1) 
        {
            System.out.print("0");
        }
        else
        {
            System.out.print(a + " ");
            System.out.print(b + " ");
            for(int i = 2; i < n ; i++) 
            {
            int c = a + b;//1
            System.out.print(c + " ");
            int temp = b;
            b = c ;
            a = temp;
            }
        sc.close();
        }
    }
}
