import java.util.Scanner;

public class C3AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length : ");
        int l = sc.nextInt();
        System.out.print("Enter the breath : ");
        int b = sc.nextInt();

        int area = l*b;
        System.out.printf("Area of the Rectangle : %d  ",area);
        sc.close();
    }
}
