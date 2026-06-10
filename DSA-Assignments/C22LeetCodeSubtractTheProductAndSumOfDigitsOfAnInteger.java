
import java.util.Scanner;

public class C22LeetCodeSubtractTheProductAndSumOfDigitsOfAnInteger 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;
        
        while(num > 0)
        {
            int digit = num%10;
            sum = sum + digit;
            prod = prod * digit;
            num = num/10;
        }

        int ans = prod-sum;

        System.out.println("Subtract The Product And Sum Of Digits Of An Integer : " + ans);
    }
}
