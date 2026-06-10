import java.util.Scanner;

public class B1EvenOrOdd {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0 ) {
            System.out.println("It is a Even Number.");
        } else {
            System.out.println("It is a Odd Number.");
        }
        sc.close();
    }
}
