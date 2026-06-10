
import java.util.Scanner;

public class C108DepreciationOfValue 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost :");
        double cost = sc.nextDouble();

        System.out.print("Enter numer of years useful life : ");
        double year = sc.nextDouble();

        System.out.print("Enter the slavage cost : ");
        double slavage = sc.nextDouble();

        double annualDecepriation = (cost - slavage)/year;
        System.out.println("Annual Decepriation Value is : " + annualDecepriation);

        System.out.print("How many years you used : ");
        int usedYears = sc.nextInt();

        double value = cost - (annualDecepriation*usedYears);

        System.out.println("Value of that product after using "+ usedYears + " years is : "  + value);
    }
}
