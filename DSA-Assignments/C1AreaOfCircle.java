import java.util.Scanner;

public class C1AreaOfCircle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        
        System.out.print("Enter the radius of the triangle : ");
        float radius = sc.nextFloat();

        float area = pi*radius*radius;

        System.out.printf("Area of the circle is %.2f : ",area);
        sc.close();
    }
}
