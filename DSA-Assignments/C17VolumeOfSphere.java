import java.util.Scanner;

public class C17VolumeOfSphere 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of Sphere : ");
        double rad = sc.nextDouble();

        double volume = (4.0/3)*3.14*rad*rad*rad;
        System.out.println("Volume of Sphere is : "+volume);
    }
}
