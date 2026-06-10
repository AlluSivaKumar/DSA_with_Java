import java.util.Scanner;

public class D5ProductOfTwoNumbers 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        int prod = prodOf(a,b);
        System.out.println("The Product is : " + prod);
    }

    static int prodOf(int a,int b)
    {
        return a*b;
    }
}
