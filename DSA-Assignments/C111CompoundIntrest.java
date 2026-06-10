
import java.util.*;

public class C111CompoundIntrest 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource" )
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principle amount :");
        double principle = sc.nextDouble();

        System.out.print("Enter the time in years :");
        double time = sc.nextDouble();

        System.out.print("Enter the number of times intrest compounded in year :");
        int times = sc.nextInt();

        System.out.print("Enter the rate of intrest :");
        double rateOfIntrest = sc.nextDouble();

        double amount = principle * Math.pow((1+(rateOfIntrest/100)/times), times*time);

        double compoundIntrest = amount-principle;
        System.out.println("Compound intrest is : "+compoundIntrest);
    }
}
