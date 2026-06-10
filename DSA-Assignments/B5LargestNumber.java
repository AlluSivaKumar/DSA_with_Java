import java.util.Scanner;

public class B5LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        int a = sc.nextInt();
        System.out.print("Enter number b :");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println(a + "is largest among " + a + " and " + b);
        }
        else
        {
            System.out.println(b + " is largest among " + a + " and " + b);
           
        }
        sc.close();
    }
}
