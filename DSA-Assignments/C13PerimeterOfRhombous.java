import java.util.Scanner;

public class C13PerimeterOfRhombous 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Rhombous :");
        double side = sc.nextDouble();

        double perimeter = 4*side;

        System.out.println("Perimeter of Rhombous is : " + perimeter);
    }
}
