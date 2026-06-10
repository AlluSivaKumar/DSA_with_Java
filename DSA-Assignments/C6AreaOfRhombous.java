import java.util.Scanner;

public class C6AreaOfRhombous 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of diagonal1:");
        double diagonal1 = sc.nextDouble();

        System.out.println("Enter the length of diagonal2:");
        double diagonal2 = sc.nextDouble();

        double area = 0.5*diagonal1*diagonal2;

        System.out.println(area);
    }
}
