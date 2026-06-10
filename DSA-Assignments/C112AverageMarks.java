import java.util.Scanner;

public class C112AverageMarks 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of subjects :");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) 
        {
            System.out.print("Enter the marks in subject "+ i +" :");
            int marks = sc.nextInt();
            sum = sum + marks;
        }

        System.out.println("You Entered all subjects marks.");
        int avg = sum/n;
        System.out.println("The average of all sujects marks is :"+avg);
    }
}
