import java.util.Scanner;

public class C12PerimeterOfSquare 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Square :");
        double side = sc.nextDouble();

        double perimeter = 4*side;

        System.out.println("Perimeter of Square is : " + perimeter);
    }
}
