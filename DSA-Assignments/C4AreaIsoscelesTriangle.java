import java.util.*;

public class C4AreaIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base length of the traiangle :");
        float a = sc.nextFloat();
        System.out.print("Enter the side of the triangle which are equal : ");
        float b = sc.nextFloat();

        float s = (a+b+b)/2;
        float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-b));
        System.out.printf("Area of the Triangle is %.2f : ",area);
        sc.close();
    }
}
