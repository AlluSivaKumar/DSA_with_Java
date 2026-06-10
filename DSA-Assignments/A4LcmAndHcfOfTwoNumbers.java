import java.util.Scanner;

public class A4LcmAndHcfOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("LCM is :" + LCM(num1, num2));
        System.out.println("HCF is :" + HCF(num1, num2));
        sc.close();
    }

    static int LCM(int a,int b) 
    {
        int lcm = 0;
        if(a>b) 
        {
            lcm = a;
        } 
        else 
        {
            lcm = b;
        }

        while (true) 
        {
            if(lcm % a == 0 && lcm % b == 0) 
            {
                return lcm;
            } 
            else 
            {
                lcm++;
            }
        }
    }


    static int HCF(int a,int b) 
    {
        int hcf = 0;
        if(a>b) 
        {
            hcf = b;
        } 
        else 
        {
            hcf = a;
        }

        while (true) 
        {
            if(a % hcf == 0 && b % hcf == 0) 
            {
                return hcf;
            } 
            else 
            {
                hcf--;
            }
        }
    }
}
