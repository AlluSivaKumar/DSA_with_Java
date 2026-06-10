import java.util.Scanner;

public class C2AreaOfTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Three sides of the triangle : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float s = (a+b+c)/2;
        float area = s*(s-a)*(s-b)*(s-c);
        System.out.printf("Area of the Triangle is %.2f : ",area);
        sc.close();
    }
}
