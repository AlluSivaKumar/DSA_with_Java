import java.util.Scanner;

public class C7AreaOfEquilateralTriangle 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the triangle :");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3)/4)*side*side;

        System.out.printf("The area of equilateral triangle is %.2f :",area);
    }
}
