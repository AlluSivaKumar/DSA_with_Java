import java.util.Scanner;

public class C15VolumeOfPrism 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base Width of the Prisim :");
        double BaseWidth = sc.nextDouble();

        System.out.print("Enter the Base length of the Prisim :");
        double BaseLength = sc.nextDouble();

        System.out.print("Enter the height of the Prisim :");
        double height = sc.nextDouble();

        double volume = BaseWidth*BaseLength*height;

        System.out.println("Volume of the prisim is : "+volume);
    }
}
