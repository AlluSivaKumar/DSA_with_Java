package FunctionsAndMethods;

import java.util.Scanner;

public class Problem 
{
    public static void main(String[] args) 
    {
        sum();
        int result = add();
        System.out.println(result);
        sum2(3,5);
    }


    static void sum()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number :");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The Sum of 1st And 2nd Number is : " + sum);
    }


    static int add()
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number :");
        int b = sc.nextInt();

        int sum = a + b;

        return sum;  
    }


    static void sum2(int a , int b)
    {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is :" +sum);
    }
}
