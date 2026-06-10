import java.util.Scanner;

public class C9AreaOfEquilateralTriangle 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the Triangle : ");
        double side = sc.nextDouble();

        double perimeter = 3*side;

        System.out.println("Perimeter of Triangle is : " + perimeter);
    }
}
