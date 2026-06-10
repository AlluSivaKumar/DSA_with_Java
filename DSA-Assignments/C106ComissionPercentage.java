import java.util.*;

public class C106ComissionPercentage 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of the product : ");
        int cost = sc.nextInt();

        System.out.print("Enter your comission : ");
        int comission = sc.nextInt();

        float comissionPercent = ((float) comission / cost) * 100;

        System.out.println("Your comission percentage is :" + comissionPercent + " % ");
    }
}
