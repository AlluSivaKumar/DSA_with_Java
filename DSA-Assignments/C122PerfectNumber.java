import java.util.Scanner;

public class C122PerfectNumber 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;

        int sum = 0;
        for(int i=1;i<temp;i++)
        {
            if(temp % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
        {
            System.out.println( num + " is a perfect number.");
        }
        else
        {
            System.out.println( num + " is not a perfect number.");
        }
    }
}
