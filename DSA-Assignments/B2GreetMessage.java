import java.util.Scanner;

public class B2GreetMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = sc.nextLine();
        greet(name);
        sc.close();
    }

    static void greet(String name) {
        System.out.println("Hiii "+name+ ".How are you?");
    }
}
