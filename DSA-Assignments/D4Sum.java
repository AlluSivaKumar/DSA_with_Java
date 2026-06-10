
import java.util.Scanner;

public class D4Sum 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        int sum = sumOf(a,b);
        System.out.println("The sum is : " + sum);
    }

    static int sumOf(int a,int b)
    {
        return a+b;
    }
}
