package T2_Loops;

import java.util.Scanner;

public class T6_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number a : ");
        int a = sc.nextInt();
        System.out.print("Enter Number b : ");
        int b = sc.nextInt();

        System.out.print("Enter the case either + - * / % : " );
        String fun = sc.next();
        switch (fun) {
            case "+":
                System.out.println( a + b);
                break;
            case "-":
                System.out.println( a + b);
                break;
            case "*":
                System.out.println( a + b);
                break;
            case "/":
                System.out.println( a + b);
                break;
            case "%":
                System.out.println( a + b);
                break;
            default:
                System.out.println("No Valid Operation.");
                break;
        }

        sc.close();
    }
}
