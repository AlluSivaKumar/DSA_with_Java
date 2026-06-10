
import java.util.Scanner;

public class D1MinMax 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number :");
        int c = sc.nextInt();

        System.out.println("Min is : "+min(a,b,c));
        System.out.println("Max is : "+max(a,b,c));
    }   

    static int min(int a,int b,int c)
    {
        if(a < b && a < c)
        {
            return a;
        }
        else if(b < a && b < c)
        {
            return b;
        }
        else 
        {
            return c;
        }
    }

    static int max(int a,int b,int c)
    {
        if(a > b && a > c)
        {
            return a;
        }
        else if(b > a && b > c)
        {
            return b;
        }
        else 
        {
            return c;
        }
    }
}
