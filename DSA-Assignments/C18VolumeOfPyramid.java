import java.util.Scanner;

public class C18VolumeOfPyramid 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base Width of the pyramid :");
        double BaseWidth = sc.nextDouble();

        System.out.print("Enter the Base length of the pyramid :");
        double BaseLength = sc.nextDouble();

        System.out.print("Enter the height of the pyramid :");
        double height = sc.nextDouble();

        double volume = BaseWidth*BaseLength*height;

        System.out.println("Volume of the pyramid is : "+volume);
    }
}
