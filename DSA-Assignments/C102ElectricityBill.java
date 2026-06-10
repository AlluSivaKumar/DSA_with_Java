import java.util.Scanner;

public class C102ElectricityBill 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Units you got: ");
        int units = sc.nextInt();
        int bill;

        if(units <= 0)
        {
            bill = 0;
        }
        else if(units >= 1 && units <= 100)
        {
            bill = units*10;
        }
        else if(units > 100 && units <= 200)
        {
            bill = units*15;
        }
        else if(units > 200 && units <= 300)
        {
            bill = units*20;
        }
        else if(units > 300 && units <= 400)
        {
            bill = units*20;
        }
        else
        {
            bill = units*30;
        }


        System.out.println("Your Electricity Bill is :" + bill);
    }
}
