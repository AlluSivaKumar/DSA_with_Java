import java.util.Scanner;

public class C11PerimeterOfRectangle 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of Rectangle :");
        double base = sc.nextDouble();

        System.out.print("Enter the slope height of the Rectangle : ");
        double height = sc.nextDouble();

        double perimeter = 2*base + 2*height;

        System.out.println("Perimeter of Rectangle is : " + perimeter);
    }
}
