
import java.util.Scanner;

public class C8PerimeterOfCircle 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle : ");
        double rad = sc.nextDouble();

        double perimeter = 2*3.14*rad;

        System.out.println("Perimeter of Circle is : " + perimeter);
    }
}
