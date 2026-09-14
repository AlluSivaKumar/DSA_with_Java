package Loops;

import java.util.Scanner;

public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        fibo(num);
    }

    static void fibo(int num)
    {
        int i = 0;
        int j = 1;
        int temp = 0 ;

        int count = 0;

        while(count < num)
        {
            System.out.print(i + " ");
            temp = i+j;
            i = j;
            j = temp;
            count++;
        }   
    }
}
