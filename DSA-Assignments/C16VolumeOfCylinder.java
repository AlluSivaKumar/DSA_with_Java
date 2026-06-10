import java.util.Scanner;

public class C16VolumeOfCylinder 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of Cylinder : ");
        double rad = sc.nextDouble();

        System.out.print("Enter the Height of cylinder : ");
        double height = sc.nextDouble();

        double volume = 3.14*rad*rad*height;
        System.out.println("Volume of cylinder is : " + volume);
    }
}
