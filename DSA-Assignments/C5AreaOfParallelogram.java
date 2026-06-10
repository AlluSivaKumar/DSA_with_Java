
import java.util.Scanner;

public class C5AreaOfParallelogram 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base length of parallelogram:");
        double base = sc.nextDouble();

        System.out.println("Enter the height length of parallelogram:");
        double height = sc.nextDouble();

        double area = base * height ;

        System.out.println("Area of Paraellogram is :" + area);

    }
}
