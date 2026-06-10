
import java.util.Scanner;

public class D2EvenOrOdd 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        String ans = EvenOrOdd(num);
        System.out.println("The given Number is " + ans);
    }

    static String EvenOrOdd(int num)
    {
        if(num % 2 ==0)
        {
            return "Even";
        }
        else
        {
            return "Odd";
        }
    }
}
