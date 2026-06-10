import java.util.Scanner;

public class C24ReturnSumIfUseEnterZero 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true)
        {
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            }
            else
            {
                sum = sum + num;
            }
        }
        
        System.out.println("The Sum of Numbers is :" + sum);
    }
}
