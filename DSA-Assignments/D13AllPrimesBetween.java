
import java.util.Scanner;

public class D13AllPrimesBetween 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter end number : ");
        int n2 = sc.nextInt();

        allPrimes(n1,n2);
        sc.close();
    }

    static void allPrimes(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            int count =0;
            for(int j=1;j<=i;j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.print(i + " ");
            }
        }
    }
}
