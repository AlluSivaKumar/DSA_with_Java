import java.util.Scanner;

public class B9ArmStrongTwoNumbers 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int num = sc.nextInt();
        int OriginalNum = num;

        int count = 0;
        int temp = num;
        while(temp > 0) {
            count++;
            temp = temp/10;
        }
        System.out.println(count);

        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, count);
            num = num/10;
        }
        System.out.println(sum);


        if(OriginalNum == sum) 
        {
            System.out.println(OriginalNum + " is a ArmStrong Number.");
        }
        else
        {
            System.out.println(OriginalNum + " is Not a ArmStrong Number.");
        }
        sc.close();
    }
}
