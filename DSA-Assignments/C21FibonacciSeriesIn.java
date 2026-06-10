
import java.util.Scanner;

public class C21FibonacciSeriesIn 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Fibonacci Numbers you want :");
        int num = sc.nextInt();
        int n1 = 0;
        System.out.print(n1+" ");
        int n2 = 1;
        System.out.print(n2+" ");
        
        for(int i=2 ; i<num ; i++)
        {
            int n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }
    }
}
