import java.util.Scanner;

public class C103AverageOfNumbers 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of numbers :");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter the Number:");
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("You Entered N numbers.");
        int avg = sum/n;
        System.out.println("The average of given Numbers is :"+avg);
    }
}
