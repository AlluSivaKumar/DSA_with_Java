import java.util.Scanner;

public class B4OperatorAndCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter opreator \n'+' for addition ,\n'-' for subraction,\n'*' for Multiplication,\n'/' for division : ");
        String operator = sc.nextLine();


        if(operator.equals("+")) {
            System.out.println(num1 + num2);
        } 
        else if(operator.equals("-"))
        {
            System.out.println(num1 - num2);
        } 
        else if(operator.equals("*"))
        {
            System.out.println(num1 * num2);
        }
        else if(operator.equals("/"))
        {
            System.out.println(num1 / num2);
        }
        else
        {
            System.out.println("you dont enter any right operators");
        }
        sc.close();
    }
}
