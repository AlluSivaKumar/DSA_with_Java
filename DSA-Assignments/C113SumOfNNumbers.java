import java.util.Scanner;

public class C113SumOfNNumbers 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers :");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter Number "+ i +" :");
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum of all numbers is :" + sum);
    }
}
