import java.util.Scanner;

public class C26AdditionOfTwoNumbers 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number:");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println("Sum of num1 & num2 is :" + sum);
    }
}
