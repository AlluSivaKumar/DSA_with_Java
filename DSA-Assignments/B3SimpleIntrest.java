import java.util.Scanner;

public class B3SimpleIntrest {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the priniciple amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the years :");
        float t = sc.nextFloat();
        System.out.print("Enter rate of intrest : ");
        float r = sc.nextFloat();

        float i = (p*t*r)/100;
        System.out.println("Simple intrest : " + i);
        sc.close();
    }
}
