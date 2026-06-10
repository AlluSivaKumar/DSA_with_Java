package FunctionsAndMethods;

import java.util.*;

public class ArmStrong 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a Number :");
        int num = sc.nextInt();
        isArmStrong(num);
    }

    static void isArmStrong(int n)
    {
        int original = n;
        String number = Integer.toString(n);
        int  len = number.length();
        double res = 0;

        while(n > 0)
        {
            int rem = n%10;
            res = res + Math.pow(rem, len);
            n = n/10;
        }

        if (original == res)
        {
            System.out.println("ArmStrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
        
    }
}
