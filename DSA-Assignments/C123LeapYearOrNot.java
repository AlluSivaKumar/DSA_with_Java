import java.util.Scanner;

public class C123LeapYearOrNot 
{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println("It is leap year");
                } else {
                    System.out.println("It is not a leap year.");
                }
            } else {
                System.out.println("It is leap year.");
            }
        } else {
            System.out.println("It is Not a leap year");
        }
        sc.close();
    }
}
