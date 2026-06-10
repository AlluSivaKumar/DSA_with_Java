
import java.util.Scanner;

public class C126PrintSums 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int positiveSum = 0;
        int negativeSum = 0;
        int evenSum = 0;
        while (true) 
        { 
            System.out.print("Enter number or Enter '0' to end : ");
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            }
            if(num > 0)
            {
                positiveSum += num;
            }
            if(num > 0 && num%2 == 0)
            {
                evenSum += num;
            }
            if(num < 0)
            {
                negativeSum += num;
            }
        }

        System.out.println("Positive Numbers sum : " + positiveSum);
        System.out.println("Negative numbers sum : " + negativeSum);
        System.out.println("Even Numbers sum : " + evenSum);
    }
}
