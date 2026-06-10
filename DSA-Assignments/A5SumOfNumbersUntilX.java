import java.util.Scanner;

public class A5SumOfNumbersUntilX {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        while(true) 
        {
            int num = sc.nextInt();
            if(num == 8) {
                break;
            }
            else {
                sum = sum + num;
            }
        }
        System.out.println("Sum is :"+sum);
        //sc.close();
    }
}
