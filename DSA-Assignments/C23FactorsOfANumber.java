import java.util.Scanner;

public class C23FactorsOfANumber
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            if(num % i == 0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
