package Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();

        for(int i=0;i<num;i++)
        {
            System.out.println(i);
        }
    }
}
