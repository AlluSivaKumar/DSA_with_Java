import java.util.Scanner;

public class C118FutureInvestmentValue 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter present value : ");
        double presentInvestment = sc.nextDouble();

        System.out.print("Enter number of years : ");
        double years = sc.nextDouble();

        System.out.print("Enter how much RateOfIntrest : ");
        double rateOfIntrest = sc.nextDouble();

        double futureInvestment = presentInvestment * Math.pow(1 + rateOfIntrest/100, years);//future investment fourmla
        System.out.println("The future investment value is : " +futureInvestment);
    }

}
