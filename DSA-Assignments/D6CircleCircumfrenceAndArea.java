import java.util.Scanner;

public class D6CircleCircumfrenceAndArea 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double rad = sc.nextDouble();
        System.out.println("Circumfrence of circle : " + circumfrence(rad));
        System.out.println("Area of circle : " + area(rad));
    }

    static double circumfrence(double radius)
    {
        return 2*3.14*radius;
    }

    static double area(double radius)
    {
        return 3.14*radius*radius;
    }
}
