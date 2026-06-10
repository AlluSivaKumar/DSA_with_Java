import java.util.Scanner;

public class D12PythagoreasTripelet 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle : ");
        int s1 = sc.nextInt();

        System.out.print("Enter height of triangle : ");
        int s2 = sc.nextInt();

        System.out.print("Enter slope of the triangle : ");
        int s3 = sc.nextInt();

        if(isPythagroes(s1, s2, s3))
        {
            System.out.println("Satsifies Pythagoreas Therom.");
        }
        else
        {
            System.out.println("not satsifies Pythagoreas therom.");
        }

    }

    static boolean isPythagroes(int s1,int s2,int s3)
    {
        return s1*s1 + s2*s2 == s3*s3;
    }
}
