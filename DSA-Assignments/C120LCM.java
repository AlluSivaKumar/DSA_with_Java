import java.util.Scanner;

public class C120LCM 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number :");
        int num2 = sc.nextInt();

        int big;
        if(num1 > num2)
        {
            big = num1;
        }
        else
        {
            big = num2;
        }

        for(int i = big; big>0 ; i++)
        {
            if(i % num1 == 0 && i % num2 == 0)
            {
                System.out.println("LCM is :" + i);
                break;
            }
        }
    }
}
