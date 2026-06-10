import java.util.Scanner;

public class C14VolumeOfCone 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of cone : ");
        double rad = sc.nextDouble();

        System.out.print("Enter the Height of cone : ");
        double height = sc.nextDouble();

        double volume = (1.0/3)*3.14*rad*rad*height;
        System.out.println("Volume of cone is : " + volume);
    }
}
