import java.util.Scanner;

public class C10PerimeterOfParallelogram 
{
    public static void main(String[] args) 
    {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the parallelogram :");
        double base = sc.nextDouble();

        System.out.print("Enter the slope length of the Circle : ");
        double slope = sc.nextDouble();

        double perimeter = 2*base + 2*slope;

        System.out.println("Perimeter of Circle is : " + perimeter);
        
    }
}
