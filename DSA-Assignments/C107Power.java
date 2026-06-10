
import java.util.Scanner;

public class C107Power 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num = sc.nextInt();
        int originalNum = num;

        System.out.print("Enter the power :");
        int pow = sc.nextInt();
        int OriginalPow = pow;

        for(int i=1;i<pow;i++)
        {
            num = num*originalNum;
        }

        System.out.printf("%d Power %d is : %d ",originalNum, OriginalPow , num);
    }
}
