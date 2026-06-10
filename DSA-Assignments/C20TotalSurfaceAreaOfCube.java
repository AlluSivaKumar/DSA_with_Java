import java.util.Scanner;

public class C20TotalSurfaceAreaOfCube 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of cube : ");
        double side = sc.nextDouble();

        double tsa = 6*side*side;
        
        System.out.println("Tota surface area of cube is : " + tsa);
    }
}
