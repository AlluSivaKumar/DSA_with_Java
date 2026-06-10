
import java.util.Scanner;

public class C104DiscountOfProduct 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of the product :");
        int cost = sc.nextInt();

        System.out.print("Enter How much percent of discount : ");
        int discountinPercent = sc.nextInt();

        int discount = (int) ((discountinPercent/100.0)*cost);
        System.out.println("The discount of the Item is :"+discount);
    }
}
