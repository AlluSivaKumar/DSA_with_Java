import java.util.Scanner;

public class C19CurvedSurfaceAreaCylinder 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of Cylinder : ");
        double rad = sc.nextDouble();

        System.out.print("Enter the Height of cylinder : ");
        double height = sc.nextDouble();

        double csa = 2*3.14*rad*height;
        System.out.println("Curved Surface Area of cylinder is : " + csa);
    }
}
