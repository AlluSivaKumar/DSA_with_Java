
import java.util.Scanner;

public class C114ArmStrongNumber 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();
        int oriNum = num;
        int temp = num;

        int count = 0;
        while(num > 0)
        {
            num = num/10;
            count++;
        }
        System.out.println("Number of letters :" + count);

        int arm = 0;
        while(oriNum > 0)
        {
            int rem = oriNum % 10;
            arm += Math.pow(rem, count);
            oriNum = oriNum/10;
        }
        System.out.println("Armstrong number :" + arm);

        if(temp == arm) 
        {
            System.out.println(temp + " is a ArmStrong Number.");
        }
        else
        {
            System.out.println(temp + " is Not a ArmStrong Number.");
        }
        sc.close();
    }
}
